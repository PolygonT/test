package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class ajaxController {
    @RequestMapping("/testAjax")
    public void testAjax(){
        System.out.println("执行成功...");
    }
}
