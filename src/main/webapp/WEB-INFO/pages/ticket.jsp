<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车票$</title>
    <style type="text/css">
        img{
            margin-left: 37%;
            width: 400px;
            height: 400px;
        }
        #time{
            text-align: center;
            color: yellow;
            text-shadow: 3px 3px 3px red;
            font-weight: bold;
            font-size: 40px;
        }
    </style>
</head>
<body>
<a href="/index.html" title="返回首页"><img src="../../img/ticket.jpg"></a>
<%  long goXia=0l;
    String time="2018-12-14 13:12:00";
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    try {
        Date date = simpleDateFormat.parse(time);
        Date now=new Date();
        goXia= (date.getTime()-now.getTime())/(1000*60*60);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    %>
<div id="time">
    距离发车还剩:<%out.print(goXia); %>小时
</div>
</body>
</html>
