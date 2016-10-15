<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理页面</title>
</head>
<body>
	<%if (session.getAttribute("login")== null  || !session.getAttribute( "login" ).equals( "ok" )) { 
    	 response.sendRedirect("mlogin.jsp"); // 验证没有通过   
        }
      %>
        <br><br><br>
        <h2>管理员<%=session.getAttribute("id")%>您好！！</h2>
        <p><a href="Findone.jsp">按订单号查询</a></p>        
        <p><a href="FindAll.jsp">列出全部订单</a></p>        
        <p><a href="Remove.jsp">指定订单号删除</a></p>
        <p><a href="lookalluser.jsp">查看所有用户</a></p></body>
        <p><a href="delete.jsp">指定用户删除</a></p>        
        <p><a href="lookone.jsp">指定用户查询</a></p>        
</body> 
</html>


