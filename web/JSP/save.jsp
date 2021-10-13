<%@ page import="com.XieJingLong.TS.util.PostDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.XieJingLong.TS.util.TitleDao" %><%--
  Created by IntelliJ IDEA.
  User: kinglong
  Date: 2021/9/24
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sava the teachers information</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/save" method="post">
    教师姓名：
    <input type="text" name="realname">
    <br>
    性别：
    <input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女
    <br>
    <%
        PostDao postDao = new PostDao();
        List<String> postNames = postDao.getNames();
    %>
    职务：
    <select id="post_list" name="post">
        <% for (String name:postNames) { %>
        <option value=<%=name%>><%=name%></option>
        <% } %>
    </select>
    <br>
    <%
        TitleDao titleDao = new TitleDao();
        List<String> titleNames = titleDao.getNames();
    %>
    职称：
    <select id="title_list" name="title">
        <% for (String name:titleNames) { %>
        <option value=<%=name%>><%=name%></option>
        <% } %>
    </select>
    <br>

    <input type="submit" name="Save!">
</form>
</body>
</html>
