<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>指定查询</title>
</head>
<body>
     <form action="Lookoneservlet" method="post">
      	<tr>    
          <td><font color="red">[请输入要查询用户号，如果点击过确定后未能 显示信息，说明该用户不存在]</font></td>       
          <td><input type="text" name="lookid" size=15 value=""/></td>                   
        </tr>      
        <tr>
          <td colspan="3" align="center" height="80"><Input type = "submit" value = "确定"> </td>
		  <td ><Input type = "reset" value = " 取消"> </td>        
        </tr>
      </form>
</body>
</html>