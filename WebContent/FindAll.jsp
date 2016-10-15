<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "must-revalidate");
    response.setDateHeader("Expires",0);
%>
<! DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员能做</title>
</head>
<body>
	  <form action="Ofindallservlet" name="findall" method="post">
	  <br><br><br><br><br><br><br>
	  
	  </form>    
	  <script language="javascript">
 			document.findall.submit();
	  </script>
</body>
</html>