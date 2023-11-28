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
	padding: 10px
}
</style>
<link rel="stylesheet" href="style.css" />
</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");

	String title = request.getParameter("title");
	String[] items = request.getParameterValues("item");

	Random rd = new Random();
	int num = rd.nextInt(items.length);
	String ran_item = items[rd.nextInt(items.length)];
	%>

	<h1 align="center">랜덤 당첨 게임</h1>
	<form action="Ex03createInput.html" align="center">
		<fieldset>
			<legend align="center">랜덤뽑기결과</legend>
			<br><%=title%><br><br>
			<h1><%=ran_item%></h1>
			<input type="submit" value="처음으로">
			
		</fieldset>
	</form>
</body>
</html>