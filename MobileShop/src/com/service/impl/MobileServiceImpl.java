package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domain.Mobile;
import com.domain.PageBean;
import com.service.MobileService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MobileServiceImpl implements MobileService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<Mobile> findAllPhone() {
        return dao.findAllPhone();
    }

    @Override
    public PageBean<Mobile> findPhoneByPage(String _currentPage, String _rows, String mobile_made) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <=0) {
            currentPage = 1;
        }
        //创建空的PageBean对象
        PageBean<Mobile> pb = new PageBean<Mobile>();
        //设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //调用dao总页数
        int totalCount = dao.findTotalCount(mobile_made);
        pb.setTotalCount(totalCount);
        int totalPage = (totalCount % rows)  == 0 ? totalCount/rows : (totalCount/rows) + 1;
        pb.setTotalPage(totalPage);
        pb.setMobile_made(mobile_made);

        //计算开始的索引
        int start = (currentPage-1) * rows;
        //调用dao查询指定页面的Mobile对象的List集合
        List<Mobile> list = dao.findByPage(start,rows,mobile_made);
        pb.setList(list);

        return pb;
    }

    @Override
    public Mobile findPhoneByVersion(String mobile_version) {
        return dao.findPhoneByVersion(mobile_version);
    }


    @Override
    public double newOrder(String username, Map<Integer, Mobile> map) {
        double sum = 0;
        for (Integer key : map.keySet()) {
            Mobile mobile = map.get(key);
            sum += mobile.getMobile_price();
        }
        String mess = map.toString();

        dao.newOrder(username,mess,sum);
        return sum;
    }
}
