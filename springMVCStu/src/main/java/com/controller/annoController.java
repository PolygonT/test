package com.controller;

import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})     //将msg存入session域中
public class annoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "username") String name) {
        System.out.println(name);
        return "success";
    }

    /*
    为什么400 bad request
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String head) {
        System.out.println(head);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println(cookie);
        return "success";
    }

    /*@RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println(user);
        return "success";
    }

    //该方法会提前执行
    @ModelAttribute
    public User ModelAttribute(String id) {
        //模拟数据库查询
        User user = new User();
        user.setAge(11);
        user.setName("张三");
        return user;
    }*/
    //另一种写法,无返回值,利用map集合
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute(value = "1") User user) {
        System.out.println(user);
        return "success";
    }

    //该方法会提前执行
    @ModelAttribute
    public void ModelAttribute(String id, Map<String,User> map) {
        //模拟数据库查询
        User user = new User();
        user.setAge(11);
        user.setName("张三");
        map.put("1",user);
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        model.addAttribute("msg","hello");  //将msg存入request域中
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model) {
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }

    //清除(好像清除request域会稍微慢一点)
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        status.setComplete();
        return "success";
    }

}
