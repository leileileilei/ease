<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录界面</title>
</head>
<body>
      <form action="mloginwork.jsp" method="post">
      <table border="0" align="center" width="300">
      <tr> <td colspan="3" align="center" height="40" id="title"> 请登录</td></tr>
        <tr> 
          <td id="t">账号:*</td>
          <td><input type="text" name="id" value=""/></td>          
        </tr>
        <tr> 
          <td id="t">密码:*</td>
          <td><input type="password" name="passWord" value=""/></td>         
        </tr>
        <tr> 
          <td><Input type = "submit" value = "登录"> </td>
		  <td><Input type = "reset" value = "取消"> </td>        
        </tr>
      </table>
      </form>     
</body>
</html>