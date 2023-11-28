<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	Object id2 = request.getAttribute("id2");
%>
<b><%=id + id2%>, <%=id2 %></b>님 환영합니다!!

</body>
</html>