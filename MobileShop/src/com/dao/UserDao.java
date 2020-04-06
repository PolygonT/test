package com.dao;

import com.domain.Mobile;
import com.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User findUserByUsernameAndPassWord(String logname, String password);

    void register(User user);

    List<Mobile> findAllPhone();

    int findTotalCount(String mobile_made);

    List<Mobile> findByPage(int start, int rows, String mobile_made);

    Mobile findPhoneByVersion(String mobile_version);

    int newOrder(String username, String mess, double sum);
}
