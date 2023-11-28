<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 당첨 게임</title>
<style>
fieldset {
	width: 400px;
}
input {
margin-bottom: 10px;
}
</style>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<h1 align="center">랜덤 당첨 게임</h1>
	<form action="Ex03randomOutput.jsp" method="post" align="center">
		<fieldset>
			<legend align='center'>랜덤뽑기</legend>
			주제 : <input type="text" name="title"><br>
			<%
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");

			int num = Integer.parseInt(request.getParameter("number"));

			for (int i = 0; i < num; i++) {
				out.print("아이템: <input type='text' name='item'><br>");
			}
			%>
			<br> <input type="submit" value="랜덤뽑기">
		</fieldset>
	</form>

</body>
</html>