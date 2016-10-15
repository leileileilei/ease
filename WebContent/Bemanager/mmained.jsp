<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理页面</title>
</head>
<body>
	<%if (session.getAttribute( "login" )== null  || !session.getAttribute( "login" ).equals( "ok" )) { 
    	 response.sendRedirect( "mlogin.jsp" ); // 验证没有通过   
        }
      %>
      <h2>管理员<%=session.getAttribute("id")%>你好！！！</h2>
      <%response.sendRedirect( "Mnanager/managerdo.jsp" ); %>             
    

      
    		 
</body>
</html>


