<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录$</title>
    <style type="text/css">
        body{
            background-image: url(../../img/6.jpg);
            width: 100%;
            height: 100%;
        }
        #login{
            margin-left: 35%;
            margin-top: 20%;
            padding: 20px;
        }
        #anniu{
            margin-left: 10%;
        }
    </style>
</head>
<body>
<div id="login">
<form action="/login.html" method="post">
   <label for="yonghuming"> 用户名：</label> <input type="text" name="account" value="请输入账号" id="yonghuming"><br>
    <label for="mima" >密&nbsp;&nbsp;&nbsp;码：</label> <input type="password" name="password" value="请输入密码" id="mima"><br>
    <div id="anniu">
    <input type="submit" value="登录">
    <input type="reset" value="重置">
    </div>
    ${error}
</div>
</form>
</body>
</html>
