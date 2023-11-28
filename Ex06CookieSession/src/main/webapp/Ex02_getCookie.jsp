<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2. Get Cookie</title>
</head>
<body>
	<%
	// 현재 클라이언트에 저장된 쿠키 가져오기
	// 전부 다 가져와서 Cookie 배열로 반환

	Cookie[] cookies = request.getCookies();
	
	// cookie의 name, value 출력
	for(Cookie c : cookies) {
		out.print(c.getName() + " : " + c.getValue() + "<br>");
	}//for
	%>
	
	<a href="Ex03_removeCookie.jsp">쿠키 삭제</a>
	
</body>
</html>