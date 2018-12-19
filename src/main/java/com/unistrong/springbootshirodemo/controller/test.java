package com.unistrong.springbootshirodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class test {
    @RequestMapping("login.do")
    public String login() {
        System.out.println("11111111");
        return "ok";
    }
}


