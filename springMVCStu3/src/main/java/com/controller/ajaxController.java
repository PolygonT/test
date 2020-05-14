package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class ajaxController {
    @RequestMapping("/testAjax")
    public String testAjax(){
        System.out.println("执行成功....");
        return "success";
    }
}
