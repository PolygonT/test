package com.dao.impl;

import com.dao.UserDao;
import com.domain.Mobile;
import com.domain.User;
import com.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User findUserByUsernameAndPassWord(String logname, String password) {
        try{
            String sql = "select * from user where logname = ? and password = ?";
            User user = template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),logname,password);
            return user;
        }catch (Exception e) {
           // e.printStackTrace();
            return null;
        }
    }

    @Override
    public void register(User user) {
        String sql = "insert into user values(?,?,?,?,?)";
        template.update(sql,user.getLogname(),user.getPassword(),user.getPhone(),user.getAddress(),user.getRealname());
    }

    @Override
    public List<Mobile> findAllPhone() {
        String sql = "select * from mobileform";
        List<Mobile> mobiles = template.query(sql, new BeanPropertyRowMapper<Mobile>(Mobile.class));

        return mobiles;
    }

    @Override
    public int findTotalCount(String mobile_made) {
        String sql = "select count(*) from mobileform where mobile_made like ?";
        return template.queryForObject(sql,Integer.class,mobile_made);
    }

    @Override
    public List<Mobile> findByPage(int start, int rows, String mobile_made) {
        String sql = "select * from mobileform where mobile_made like ? limit ?,?";
        return template.query(sql,new BeanPropertyRowMapper<Mobile>(Mobile.class),mobile_made,start,rows);
    }

    @Override
    public Mobile findPhoneByVersion(String mobile_version) {
        String sql = "select * from mobileform where mobile_version = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<Mobile>(Mobile.class),mobile_version);
    }

    @Override
    public int newOrder(String username, String mess, double sum) {
        String sql = "insert into orderform values(?,?,?,?)";
        template.update(sql,null,username,mess,sum);
        return 1;
    }


}
