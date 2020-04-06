package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domain.Mobile;
import com.domain.User;
import com.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassWord(user.getLogname(), user.getPassword());
    }
}
