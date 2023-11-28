<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1. Set Cookie</title>
</head>
<body>
	<%
	// 1. 쿠키 객체 생성 //new Cookie(String name, String value);
	Cookie cookie = new Cookie("test", "테스트");

	// 2. 만료기간(초단위) 설정
	cookie.setMaxAge(60 * 60 * 24 * 365);

	// 3. 서버에서 생성된 쿠키 to client (response 객체 이용)
	response.addCookie(cookie);

	/* 만료기간을 지정하면 session cookie로 생성된다.
		이는 session을 활용할 때 사용된다.
		브라우저를 끄면 전부 사라진다 */
	response.addCookie(new Cookie("id", "smart")); // 만료기간 없는 쿠기
	%>
	
	<a href="Ex02_getCookie.jsp">쿠키확인</a>
	<a href="Ex02_getCookie">쿠키확인(Servlet)</a>
	
</body>
</html>