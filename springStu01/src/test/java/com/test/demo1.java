package com.test;

import com.domain.User;
import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {

    @Test
    public void fun1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User)ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testAop1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.saveAccount();
        as.updateAccount(1);
    }
}
