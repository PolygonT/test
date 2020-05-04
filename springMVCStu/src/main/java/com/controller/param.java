package com.controller;

import com.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class param {
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("保存账户...");
        System.out.println(account);

        return "success";
    }
}
