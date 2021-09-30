<%@ page import="java.util.List" %>
<%@ page import="com.XieJingLong.TS.entity.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: kinglong
  Date: 2021/9/27
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>教师信息列表</title>
</head>
<body>
    <h1>教师信息列表</h1>
    <hr>
    <table border="1px" width="50%">
        <tr align="center">
            <th>工号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>职位</th>
            <th>职称</th>
            <th>操作</th>
        </tr>
        <tr align="center">
            <td>0</td>
            <td>示例</td>
            <td>男</td>
            <td>班主任</td>
            <td>初级教师</td>
            <td>
                <a href="">修改</a>
                <a href="">删除</a>
            </td>
        </tr>
        <%
            List<Teacher> teacherList=(List<Teacher>)request.getAttribute("teacherList");
            for (Teacher c:teacherList) {
        %>
        <tr align="center">
            <td><%=c.getId()%></td>
            <td><%=c.getRealname()%></td>
            <td><%=c.getSex()%></td>
            <td><%=c.getPost()%></td>
            <td><%=c.getTitle()%>%></td>
            <td>
                <a href="<%=request.getContextPath()%>/JSP/updateList.jsp?id=<%=c.getId()%>&realname=<%=c.getRealname()%>&sex=<%=c.getSex()%>" >修改</a>
                <a href="<%=request.getContextPath()%>/delete?id=<%=c.getId()%>" >删除</a>
            </td>
        </tr>
        <%
            }
        %>

    </table>
</body>
</html>
