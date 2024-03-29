<%--
  Created by IntelliJ IDEA.
  User: ZERA
  Date: 2024/3/29
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%--    <h1>--%>
<%--        <a href="${pageContext.request.contextPath}/WEB-INF/vip.jsp">点击查看VIP</a>--%>
<%--    </h1>--%>

<%--    <h1>--%>
<%--        <a href="${pageContext.request.contextPath}/vip.action">点击查看VIP</a>--%>
<%--    </h1>--%>


<form action="${pageContext.request.contextPath}/login.action">
    用户名:<input type="text" name="username">
    密码：<input type="password" name="password">
</form>

</body>
</html>
