package com.unistrong.springbootshirodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }
    @RequestMapping("/error.html")
    public String error(HttpServletRequest request){
        request.setAttribute("error","权限不足");
        return "index";
    }
    @RequestMapping("/del.html")
    public String del(HttpServletRequest request){
        request.setAttribute("error","权限不足");
        return "index";
    }


}
