package com.controller;

import com.domain.User;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/demo")
public class DispacherAndRedirectController {
    ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    /**
     * 有参跳转
     * @return
     */
    @RequestMapping("/testString")
    public String testString() {
        System.out.println("testString...");
        return "success";
    }

    /**
     * 无参跳转
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("testVoid....");
        /*try {
            request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            System.out.println(request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mv = (ModelAndView) ac.getBean("modelAndView");
        User user = (User) ac.getBean("user");
        System.out.println(mv);
        System.out.println(user);
        //ModelAndView mv = new ModelAndView();
        //User user = new User();
        //模拟数据库查询

        user.setName("张三");
        user.setAge(22);
        mv.addObject("user",user);
        mv.setViewName("success");

        return mv;
    }
}
