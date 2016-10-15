<%@ page language="java" import="java.util.*,beans.Order"
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
		Order ord = (Order)request.getAttribute("ord");
	%>
	<table border="1">
		<tr>
			<th>订单号</th>
			<th>账号</th>
			<th>药方</th>
			<th>副数</th>
			<th>备注</th>
			<th>日期</th>
		</tr>		
		<tr>
			<td><%=ord.getOid()%></td>
			<td><%=ord.getId()%></td>
			<td><%=ord.getText()%></td>
			<td><%=ord.getMnum()%></td>
			<td><%=ord.getRemark()%></td>
			<td><%=ord.getOdate()%></td>
		</tr>		
	</table>
</body>
</html>