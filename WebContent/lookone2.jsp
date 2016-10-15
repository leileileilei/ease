<%@ page language="java" import="java.util.*,beans.User"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单显示页面</title>
</head>
<body>
	<hr />
	查询显示
	<br>
	<%
		User user = (User)request.getAttribute("user");
	%>
	<table border="1">
		<tr>
			<th>账号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>电话</th>
			<th>邮箱</th>
			<th>地址</th>
		</tr>	
		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getSex()%></td>
			<td><%=user.getAge()%></td>
			<td><%=user.getPhone()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getAddress()%></td>
			
		</tr>
		
	</table>
</body>
</html>