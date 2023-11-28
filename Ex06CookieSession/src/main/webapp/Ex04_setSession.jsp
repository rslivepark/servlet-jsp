<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set Session</title>
</head>
<body>
<%
	session.setAttribute("id", "strawberry");
	session.setAttribute("money", 20000000);
	

	ArrayList<String> names = new  ArrayList<>();
	names.add("pineapple");
	names.add("orange");
	session.setAttribute("names", names);

	
%>

<a href="Ex05_getSession.jsp">세션확인</a>
<a href="Ex05_getSession">세션확인 servlet</a> <!-- //url mapping --> 
</body>
</html>