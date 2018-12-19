package com.unistrong.springbootshirodemo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class LoginController {

    @RequestMapping("gologin.html")
    public  String gologin(){
        return "login";
    }
    @PostMapping("login.html")
    public String login(String account, String password, HttpServletRequest request){
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(account,password);
        try {
            subject.login(token);
//            long second=0l, minute=0l,hour=0l,day=0l ;
//            {
//                String time1="2018-11-18 21:00:00";
//                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//                try {
//                    Date date=simpleDateFormat.parse(time1);
//                    Date date1=new Date();
//                    //计算当前时间到  2018-11-18 21:00:00的毫秒数
//                    Long length= date1.getTime()-date.getTime();
//                    System.out.println(length);
//                    ////计算当前时间到  2018-11-18 21:00:00的秒数
//                    second=length/(1000);
//                    System.out.println(second);
//                    ////计算当前时间到  2018-11-18 21:00:00的分钟数
//                     minute=length/(1000*60);
//                    System.out.println(minute);
//                    //计算当前时间到  2018-11-18 21:00:00的小时数
//                     hour=length/(1000*60*60);
//                    System.out.println(hour);
//                    //计算当前时间到 2018-11-18 21:00:00的天数
//                     day=hour/24;
//                    System.out.println(day);
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//            }
//            request.setAttribute("second" ,second);
//            request.setAttribute("minute" ,minute);
//            request.setAttribute("hour" ,hour);
//            request.setAttribute("day" ,day);
            return "redirect:index.html";
           // return "index";
        } catch (AuthenticationException e) {
            request.setAttribute("error" ,"账号或者密码错误");
            return "login";
        }
    }

    @RequestMapping("logout.html")
    public  String logout(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }
}
