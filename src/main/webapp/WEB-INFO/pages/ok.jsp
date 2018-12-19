<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录$</title>
</head>
<body>
<form action="/login.html" method="post">
    用户名： <input type="text" name="username"><br>
    密  码： <input type="password" name="password"><br>
    <input type="submit" value="登录"> ${erro}
</form>
</body>
</html>
