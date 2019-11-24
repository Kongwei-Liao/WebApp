<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
    <form action="DisplayHeader" method="get">
        网址名：<input type="text" name="name">
        <br />
        网址：<input type="text" name="url" />
        <input type="checkbox" name="baidu" checked="checked" /> 百度
        <input type="checkbox" name="google"  /> Google
        <input type="checkbox" name="taobao" checked="checked" /> 淘宝
        <input type="submit" value="提交" />
    </form>
</body>
</html>