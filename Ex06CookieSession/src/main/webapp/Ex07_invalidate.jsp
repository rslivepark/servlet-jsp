<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>7. Invalidate</title>
</head>
<body>
	<%
	session.invalidate();
	%>

	<a href="Ex05_getSession.jsp">세션확인</a>
</body>
</html>