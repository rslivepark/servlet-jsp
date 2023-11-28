<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3. Print Name</title>
</head>
<body>
<%
// 한글 인코딩
request.setCharacterEncoding("utf-8");
response.setContentType("text/html; charset=utf-8");

// 식별자 가져오기
String name = request.getParameter("name");

%>

입력한 이름 : <%= name %>

<% out.close(); %>
</body>
</html>