<%--
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
    职务：
    <select id="post_list" name="post_id">
        <option value="1">普通教师</option>
        <option value="2">班主任</option>
        <option value="3">教导主任</option>
    </select>
    <br>
    职称：
    <select id="title_list" name="title_id">
        <option value="1">初级教师</option>
        <option value="2">中级教师</option>
        <option value="3">高级教师</option>
    </select>
    <br>

    <input type="submit" name="Save!">
</form>
</body>
</html>
