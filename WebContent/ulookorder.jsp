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
	<form action="Ulookorderservlet" name="ulookorder" method="post">
      	<tr> 
          <td><input  name="id" value=<%=session.getAttribute("id")%>></td>          
        </tr>
      </form>
      <script language="javascript">
 			document.ulookorder.submit();
	  </script>
</body>
</html>