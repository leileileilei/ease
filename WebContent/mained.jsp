	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录后界面</title>
</head>
<body>     	  	  	  
      <%if (session.getAttribute( "login" )== null  || !session.getAttribute( "login" ).equals( "ok" )) { 
    	 response.sendRedirect( "login.jsp" ); // 验证没有通过   
        }
      %>
      <h3 align="center">尊敬的<%=session.getAttribute("id")%>你好！！！</h3>
       <tr><td colspan="3" align="right" height="40" id="title">
            <a href="ulookself.jsp"><font color="red"><strong>查看个人信息</strong></font></a></td></tr>
      		<a href="updateself.jsp"><font color="red"><strong>编辑个人信息</strong></font></a>
      		<a href="ulookorder.jsp"><font color="red"><strong>查看订单</strong></font></a>
           
      
      <form action="Oservlet" method="post">
      <table border="0" align="center" width="300">
     
      <tr> <td colspan="3" align="center" height="40" id="title"></td></tr>
        <tr> 
          <td>账号:</td>
          <td><input type="text" name="id" size=15 value=<%=session.getAttribute("id")%>><font color="red">[您的账号]</font></td>          
        </tr>
        <tr> 
          <td>药方:</td>
          <td colspan="2"><textarea  name="text" rows="9" cols="90"></textarea></td>          
        </tr>
        <tr>    
          <td>副数:</td>       
          <td><input type="text" name="mnum" size=3 value=""/>副 <font color="red">[请您务必写清需要多少副中药,如需煎药请备注，每副药加两元]</font></td>                   
        </tr>
        <tr> 
          <td>备注:</td>
          <td><input type="text" placeholder="请输入您的手机号:" name="remark" size=77 value=""/><font color="red">[如需其它帮助也请在此说明]</font></td>          
        </tr>
        
        <tr>       
          <td><Input type = "submit" value = "提交"> </td>
		  <td><Input type = "reset" value = "取消"> </td>        
        </tr>
      </table>
      </form>     	      
</body>
</html>