<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>

	<%
	String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pw");
	%>
	
	<b><%=id%></b>님 환영합니다. <a href="Ex08_logout">로그아웃</a>
	<br>
	<br>
	session id : <%=id%><br> 
	session pw : <%=pw%><br>
	<a href="Ex08_invalidate.jsp">세션 삭제</a>

</body>
</html>