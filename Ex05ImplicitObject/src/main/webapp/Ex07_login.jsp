<%@page import="java.net.URLEncoder"%>
<%@page import="java.lang.module.ResolutionException"%>
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

	String smart = "smart";
	String num = "123";

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	String url;

	if (id.equals("smart") && pw.equals("123")) {
		// request.setAttribute("html 식별자", 변수)
		// request.setAttribute("id", id); // request 영역에 값을 저장!
		request.setAttribute("id2", id);

		// RequestDispatcher : 클라이언트로부터 최초에 들어온 요청을 원하는 자원으로 넘기는 등의 메서드를 가짐!!
		RequestDispatcher rd = request.getRequestDispatcher("Ex07_loginSuccess.jsp"); // 
		// forward : 다음 페이지로 request와 response 객체를 넘기는 역할
		rd.forward(request, response);

		// url = "Ex07_loginSuccess.jsp?id=" + URLEncoder.encode("smart", "utf-8");
	} else {
		response.sendRedirect("Ex07_loginFail.jsp");
	}

	//response.sendRedirect(url);
	%>
</body>
</html>