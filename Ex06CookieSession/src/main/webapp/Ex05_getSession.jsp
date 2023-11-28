<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Session</title>
</head>
<body>
	<%
	String id = (String) session.getAttribute("id");
	Integer money = (Integer) session.getAttribute("money");
	
	ArrayList<String> names = new ArrayList<>();
	try {
		names = (ArrayList<String>) session.getAttribute("names");

	} catch (NullPointerException e) {
		System.out.print(e);
	}
	
	// names: <b><%=names.toString() 
	%>
	

	id:
	<b><%=id%></b>
	<br> money:
	<b><%=money%></b>
	<br>



	<a href="Ex06_removeSession.jsp">세션 삭제</a>
	<a href="Ex07_invalidate.jsp">세션 전부 삭제</a>

</body>
</html>