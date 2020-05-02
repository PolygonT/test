package com.test;

import com.domain.User;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class demo1 {
    @Autowired
    private AccountService as;
    @Test
    public void testAutoWired() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        as.saveAccount();
        System.out.println(as);
    }
}
