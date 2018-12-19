package com.unistrong.springbootshirodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

    @RequestMapping("ticket.html")
    public  String ticket(){
        return "ticket";
    }
    @RequestMapping("photo.html")
    public  String photo(){
        return "photo";
    }
    @RequestMapping("map.html")
    public  String map(){
        return "map";
    }

}
