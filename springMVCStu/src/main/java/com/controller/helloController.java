package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @RequestMapping(path="/hello")  //RequestMapping的value属性和path属性作用相同。可以省略属性名
    public String sayHello() {
        System.out.println("hello springMVC");
        return "success";
    }
}
