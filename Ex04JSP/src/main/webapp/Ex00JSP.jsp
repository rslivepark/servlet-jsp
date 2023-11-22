<!-- 지시자(Directive) : JSP 설정 정보 및 다른 문서에 포함을 등을 함 -->
<%@ page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본</title>
</head>
<body>
	<%
	/*
	스크립트릿 scriptlet : JSP 페이지 내부에 자바 소스코드를 넣을 수 있다.
	.java 클래스 내에 작성하는 코드 그대로 작성한다. (세미콜론 ; 작성이 필수다)
	*/

	Random rd = new Random();

	int num1 = 20; //스크립트릿에 작성한 변수 또는 상수 선언 코드는 service()에 작성됨 (지역변수)
	int num2 = 30;
	int sum = num1 + num2;
	%>

	<%=sum%>
	<!-- 표현식(expression) : 화면에 출력하기 위해 사용한다! (세미콜론 ; 작성ㄴㄴ) -->
	
	<%=sum + 100%>
	<!-- 연산도 가능 -->
	
	<%=Math.sqrt(sum)%>
	<!-- 메서드 호출 후 반환도 가능 -->

</body>
</html>