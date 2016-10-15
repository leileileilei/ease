<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head> 
     <title>注册页面</title>
     <style type="text/css"> @import url(css/ofsignup.css); </style>
     <script language="javascript" src="forsignup.js"></script>
  </head>  
  <body>
    <form action="Uservlet" method="post">
      <table border="0" align="center" width="600">
        <tr> <td colspan="3" align="center" height="40" id="title"> 填写注册信息</td></tr>
        <tr> 
          <td id="t">用户账号:*</td>
          <td><input type="text" name="id" value=""/></td>
          <td id="i">请输入身份证号码</td>
        </tr>
        <tr> 
          <td id="t">密码:*</td>
          <td><input type="password" name="passWord" value=""/></td>
          <td id="i">设置登录密码，至少6位！</td>
        </tr>
        <tr> 
          <td id="t">确认密码:*</td>
          <td><input type="password" name="password1" value=""/></td>
          <td id="i">请再输入一次你的密码！</td>
        </tr>
        <tr> 
          <td id="t">姓名:*</td>
          <td><input type="text" name="name" value=""/></td>
          <td id="i">请输入您的真实姓名</td>
        </tr>
         <tr> 
          <td id="t">性别:</td>
          <td><input type="radio" name="sex" value="男" checked/>男
              <input type="radio" name="sex" value="女" />女
          </td>
          <td id="i">请选择你的性别！</td>
        </tr>
        <tr> 
          <td id="t">年龄:</td>
          <td><input type="text" name="age" value=""/></td>
          <td id="i">请填写您的年龄！</td>
        </tr>
        <tr> 
          <td id="t">手机号:</td>
          <td><input type="text" name="phone" value=""/></td>
          <td id="i">请输入大陆手机号！</td>
        </tr>
        <tr> 
          <td id="t">邮箱*:</td>
          <td><input type="text" name="email" value=""/></td>
          <td id="i">请输入常用邮箱！</td>
        </tr>
        <tr> 
          <td id="t">地址:</td>
          <td><input type="text" name="address" value=""/></td>
          <td id="i">请填写您的地址！</td>
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
