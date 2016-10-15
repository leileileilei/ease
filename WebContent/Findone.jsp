<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>指定查询</title>
</head>
<body>
     <form action="Ofindoneservlet" method="post">
      	<tr>    
          <td><font color="red">[请输入要查询订单号]</font></td>       
          <td><input type="text" name="queryid" size=15 value=""/></td>                   
        </tr>      
        <tr>
          <td colspan="3" align="center" height="80"><Input type = "submit" value = "确定"> </td>
		  <td ><Input type = "reset" value = " 取消"> </td>        
        </tr>
      </form>
</body>
</html>