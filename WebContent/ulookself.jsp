<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "must-revalidate");
    response.setDateHeader("Expires",0);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看订单</title>
</head>
<body>
	<form action="Lookoneservlet" name="ulookone" method="post">
      	<tr> 
          <td>查询的是<input  name="lookid" size=15 value=<%=session.getAttribute("id")%>></td>          
        </tr>
      </form>
      <script language="javascript">
 			document.ulookone.submit();
	  </script>
</body>
</html>