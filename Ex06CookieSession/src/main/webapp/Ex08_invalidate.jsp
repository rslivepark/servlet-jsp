<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invalidate 세션 전체 삭제</title>
</head>
<body>
	<%
	session.invalidate();
	%>
	<a href="Ex08_main.jsp">세션삭제 확인</a>
</body>
</html>