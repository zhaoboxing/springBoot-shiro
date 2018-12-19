<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>照片$</title>
    <script >
        function bigImg(x)
        {
            x.style.height="300px";
            x.style.width="300px";
        }

        function normalImg(x)
        {
            x.style.height="200px";
            x.style.width="200px";
        }
    </script>
    <style type="text/css">
        body{
            background-image: url(../../img/1.jpg);
        }
       img{
           width: 200px;
           height: 200px;
       }
        #box{
            margin-left: 400px;
        }
    </style>
</head>
<body>
<div id="box">
    <a href="/index.html" title="返回首页">返回首页</a>
<div>
<img src="../../img/1.1.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.2.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.3.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
</div>
<div>
<img src="../../img/1.5.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.4.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.6.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
</div>
<div>
<img src="../../img/1.9.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.8.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
<img src="../../img/1.7.jpg" onmousemove="bigImg(this)" onmouseout="normalImg(this)">
</div>

</div>
</body>
</html>
