<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<style type="text/css"> @import url(css/ofsignup.css); </style>
</head>
<body>
      <form action="loginwork.jsp" method="post">
      <table border="0" align="center" width="300">
      <tr> <td colspan="3" align="center" height="40" id="title"> 请登录</td></tr>
        <tr> 
          <td id="t">账号:*</td>
          <td><input type="text" name="id" size=15 value=""/></td>          
        </tr>
        <tr> 
          <td id="t">密码:*</td>
          <td><input type="password" name="passWord" size=15 value=""/></td>         
        </tr>
        <tr> 
          <td><Input type = "submit" value = "登录"> </td>
		  <td><Input type = "reset" value = "取消"> </td>        
        </tr>
      </table>
      </form>     
</body>
</html>