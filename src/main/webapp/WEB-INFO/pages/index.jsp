<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页$</title>
    <style type="text/css">
        body{
            background-image: url(../../img/1.jpg);
            width: 100%;
            height: 100%;
        }
        #time{
            opacity: 0.8;
            margin-left:40%;
            margin-top: 10%;
            color: black;
            font-size: 20px;
            width: 300px;
            height: 100px;
        }
        h1{
            text-align: center;
            color: red;
        }
        #gohome{
            color: red;
            font-weight: bold;
            font-size: 40px;
            text-shadow: 3px 3px 3px yellow;
            margin-left: 30%;
            opacity: 0.8;

        }
        ul{
            list-style: none;
        }
        a{
            background-color: dimgray;
            color: chartreuse;
        }
        #anniu{
            padding-left: 80%;
        }

    </style>
</head>
<body >
<% response.setIntHeader("Refresh",1);%>
<% long second=0l, minute=0l,hour=0l,day=0l ,goXia=0l ,seeLover=0l;

        String time1="2018-11-18 21:00:00";
        String time2="2018-12-14 13:12:00";
        String time3="2018-12-16 10:30:00";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date date=simpleDateFormat.parse(time1);
            Date date1=simpleDateFormat.parse(time2);
            Date date2=simpleDateFormat.parse(time3);
            Date now=new Date();
            //计算当前时间到  2018-11-18 21:00:00的毫秒数
            Long length= now.getTime()-date.getTime();
            System.out.println(length);
            ////计算当前时间到  2018-11-18 21:00:00的秒数
            second=length/(1000);
            System.out.println(second);
            ////计算当前时间到  2018-11-18 21:00:00的分钟数
            minute=length/(1000*60);
            System.out.println(minute);
            //计算当前时间到  2018-11-18 21:00:00的小时数
            hour=length/(1000*60*60);
            System.out.println(hour);
            //计算当前时间到 2018-11-18 21:00:00的天数
            day=hour/24;
            goXia= (date1.getTime()-now.getTime())/(1000*60*60);
            seeLover= (date2.getTime()-now.getTime())/(1000);
            System.out.println(day);%>
<div >
        <p id="gohome"> <%out.print("距离见到牛牛还需要："+seeLover+"秒");%></p>
    <div id="anniu">
        <a  href="/ticket.html"  title="查看车票" type="button">查看车票</a>
        <a  href="/map.html" type="button" title="查看地图"  type="button">查看地图</a>
        <a  href="/photo.html" title="查看照片"  type="button">查看照片</a>
    </div>

</div>
          <div id="time">
              <ul>
                  <li><% out.print("已经分离："+second+"秒了");%></li>
                  <li><%out.print("已经分离："+minute+"分钟了");%></li>
                  <li><%out.print("已经分离："+hour+"小时了");%></li>
                  <li><%out.print("已经分离："+day+"天了");%></li>
                  <li><%out.print("距离回西安还有："+goXia+"小时");%></li>
              </ul>
          </div>

<%
        } catch (ParseException e) {
            e.printStackTrace();
        } ;%><br/>




<%--权限判定的时候，不区分大小写--%>

<%--<shiro:hasRole name="manager">
    <button>用户拥有经理角色</button><br>

</shiro:hasRole>
<shiro:hasRole name="employee">
    <button>用户拥有职工角色</button><br>
</shiro:hasRole>
<shiro:hasRole name="director">
    <button>用户拥有主管角色</button><br>
</shiro:hasRole>
<shiro:hasRole name="boose">
    <button>用户拥有老板角色</button><br>
</shiro:hasRole>
<shiro:hasPermission name="/index.html">
    <p>首页查看</p><br>
</shiro:hasPermission>
<shiro:hasPermission name="selerctAll">
    <p>所用用户</p>
</shiro:hasPermission>
<a href="/logout.html" >退出登录</a><br>

<shiro:hasPermission name="/deleteser.html">
    <p>删除用户</p><br>
</shiro:hasPermission>--%>
</body>
</html>
