package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domain.Mobile;
import com.domain.PageBean;
import com.service.MobileService;
import com.service.UserService;
import com.service.impl.MobileServiceImpl;
import com.service.impl.UserServiceImpl;
import com.util.DbUtil;
import com.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dbDemo {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    MobileService service = new MobileServiceImpl();
    UserDao dao = new UserDaoImpl();

    @Test
    public void fun1(){
        String sql = "insert into user values(?,?,?,?,?)";
        template.update(sql,"熊","1","1","1","1");
    }

    @Test
    public void fun2() {
        DbUtil db = new DbUtil();

        String sql = "insert into user values('熊','1','3','4','5')";
        try {
            db.getConnection().prepareStatement(sql).executeUpdate();
            db.closeCon();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //查询所有手机
    @Test
    public void fun3() {
        List<Mobile> allPhone = service.findAllPhone();
        for (Mobile mobile : allPhone) {
            System.out.println(mobile);
        }
    }

    //查询所有手机个数
/*    @Test
    public void fun4() {
        int totalCount = dao.findTotalCount();
        System.out.println(totalCount);
    }*/

    //分页查询功能测试
    @Test
    public void fun5() {
       /* List<Mobile> mobileList = dao.findByPage(0, 2);
        System.out.println(mobileList);*/

        PageBean<Mobile> pb = service.findPhoneByPage("0", "2", "Apple_Inc.");
        System.out.println(pb);

    }

    @Test
    public void fun6() {
       /* List<Mobile> mobileList = dao.findByPage(0, 2);
        System.out.println(mobileList);*/

        Mobile mobile = service.findPhoneByVersion("A89S6");
        System.out.println(mobile);

    }

    @Test
    public void fun7() {
        /*Map<Integer, Mobile> map = new HashMap<Integer, Mobile>();
        Mobile mobile = new Mobile();
        mobile = service.findPhoneByVersion("A89S6");
        map.put(0,mobile);
        mobile = service.findPhoneByVersion("B8978");
        map.put(1,mobile);
        mobile = service.findPhoneByVersion("C555");
        map.put(2,mobile);
        System.out.println(map);

        service.newOrder("123",map);
        System.out.println(i);*/
    }
}
