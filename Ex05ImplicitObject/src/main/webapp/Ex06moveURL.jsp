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
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");

	String url = request.getParameter("url");
	String moveURL;

	if (url.equals("naver")) {
		moveURL = "https://www.naver.com";
	} else if (url.equals("daum")) {
		moveURL = "https://www.daum.net";
	} else {
		moveURL = "https://www.google.com";
	}
	response.sendRedirect(moveURL);
	%>
</body>
</html>