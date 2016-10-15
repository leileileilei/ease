<%@ page language="java" import="java.util.*,beans.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<! DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证页面</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");
		if (id != null && !id.equals("")) {
			try { /*     * 连接数据库     */
				Connection con = (Connection)DbConnecter.getDBconnection();
				
				String sql = "select * from tuser where id=? and passWord=?";// 准备查询语句
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1,id);
				pstmt.setString(2,passWord);
				ResultSet rs = pstmt.executeQuery();
				
				if (rs.next()) {
					session.setAttribute("login", "ok"); // 验证通过之后，跳转到后续页面
					session.setAttribute("id", id);
					%>
				

			<jsp:forward page = "mained.jsp"/>
	<%
 	} else
 				out.println(" 错误的用户名和密码"); // 验证未通过，显示错误信息    
 			out.println("<a href=login.jsp>重新登录</a>");
 		} catch (Exception ee) {

 			ee.printStackTrace();

 		}

 	} else {
 		out.println(" 请先登录！"); // 验证未通过，显示错误信息   
 		out.println("<a href=login.jsp> 返回</a>");
 	}
   %>
</body>
</html>