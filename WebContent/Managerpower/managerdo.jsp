<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<! DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员能做</title>
</head>
<body>
	
        <br><br><br>
        <h2>管理员<%=session.getAttribute("id")%>您好！！</h2>
        <p><a href="Findone.jsp">按条件查询</a></p>        
        <p><a href="FindAll.jsp">列出全部订单</a></p>        
        <p><a href="Remove.jsp">删除订单</a></p>       
</body>
</html>