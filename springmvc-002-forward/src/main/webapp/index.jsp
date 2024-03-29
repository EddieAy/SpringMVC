<%--
  Created by IntelliJ IDEA.
  zera.pojo.User: ZERA
  Date: 2024/3/28
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<br>

<h1>
    <a href="${pageContext.request.contextPath}/one.action">1.请求转发页面</a>
</h1>
<h1>
    <a href="${pageContext.request.contextPath}/two.action">2.请求转发action 本质有点像一个servlet</a>
</h1>
<h1>
    <a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a>
</h1>
<h1>
    <a href="${pageContext.request.contextPath}/four.action">4.重定向action</a>
</h1>
<h1>
    <a href="${pageContext.request.contextPath}/five.action">5.随便重定向</a>
</h1>

<h2>
    <a href="${pageContext.request.contextPath}/six.action?name=EDD">6.服务器传递数据</a>
</h2>


</body>
</html>
