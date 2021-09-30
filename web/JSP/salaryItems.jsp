<%@ page import="java.util.ArrayList" %>
<%@ page import="com.XieJingLong.TS.entity.SalaryItem" %><%--
  Created by IntelliJ IDEA.
  User: 17964
  Date: 2021/9/30
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>工资项目表</title>
</head>
<body>
<h1>工资列表</h1>
<%
    ArrayList<SalaryItem> salaryItems = (ArrayList<SalaryItem>) request.getAttribute("salaryItems");
    for (SalaryItem item : salaryItems) {
%>
<table border="1" width="50%">
    <tr align="center">
        <th>工号</th>
        <th>姓名</th>
        <th>职务工资</th>
        <th>职称工资</th>
        <th>应发工资</th>
        <th>五险</th>
        <th>住房公积金</th>
        <th>实发工资</th>
    </tr>
    <tr align="center">
        <td><%=item.getTeacherId()%>
        </td>
        <td><%=item.getTeacherName()%>
        </td>
        <td><%=item.getPostSalary()%>
        </td>
        <td><%=item.getTitleSalary()%>
        </td>
        <td><%=item.getTotalPayAmount()%>
        </td>
        <td><%=item.getInsurance()%>
        </td>
        <td><%=item.getPublicReserveFunds()%>
        </td>
        <td><%=item.getFinalPayAmount()%>
        </td>
    </tr>
</table>
<%
    }
%>
</body>
</html>
