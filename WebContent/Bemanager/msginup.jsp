<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head> 
     <title>管理员注册页面</title>
     <style type="text/css"> @import url(css/ofsignup.css); </style>
     <script language="javascript" src="forsignup.js"></script>
  </head>  
  <body>
    <form action="Mservlet" method="post">
      <table border="0" align="center" width="600">
        <tr> <td colspan="3" align="center" height="40" id="title"> 填写管理员注册信息</td></tr>
        <tr> 
          <td id="t">用户账号:*</td>
          <td><input type="text" name="id" value=""/></td>
          <td id="i">用户名由字母开头，后跟字母、数字或下划线！</td>
        </tr>
        <tr> 
          <td id="t">密码:*</td>
          <td><input type="password" name="passWord" value=""/></td>
          <td id="i">设置登录密码，至少6位！</td>
        </tr>
        <tr> 
          <td id="t">确认密码:*</td>
          <td><input type="password"  value=""/></td>
          <td id="i">请再输入一次你的密码！</td>
        </tr>        
        <tr>         
          <td colspan="3" align="center" height="40">
            <input type="submit" value="提交"/>&nbsp;
            <input type="reset" value="取消"/>
          </td>
        </tr>
      </table>    
    </form>
  </body>
</html>
