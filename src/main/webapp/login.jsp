<%--@elvariable id="error" type=""--%>
<%--
  Created by IntelliJ IDEA.
  User: MIXFOREAT
  Date: 2019/11/21
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%=request.getAttribute("error")==null?"":request.getAttribute("error")%>--%>
<%
    pageContext.setAttribute("pageInfo","Page中的数据");
%>
<span>${error}</span>
<form action="LoginServlet" method="post">
    用户名：<input type="text" name="name"/><br>
    密码：<input type="password" name="pwd"/><br>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
