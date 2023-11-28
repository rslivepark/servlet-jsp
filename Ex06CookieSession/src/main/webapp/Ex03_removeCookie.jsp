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
	// 쿠키 삭제하는 메소드 따로 없음
	// 1. 삭제하고 싶은 쿠키의 key name과 같은 name을 가진 쿠키 생성
	Cookie cookie = new Cookie("test", "");

	// 2. 쿠키 만료기간 0초로 설정
	cookie.setMaxAge(0);

	// 3. 서버에서 생성된 쿠키를 클라이언트로 전송(response)
	response.addCookie(cookie);
	%>

	<a href="Ex02_getCookie.jsp">쿠키 확인</a>
</body>
</html>