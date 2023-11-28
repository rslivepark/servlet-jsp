<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2. 테이블 만들기</title>
</head>
<body>

	<table border='1'>
		<tr>
			<%
			for (int i = 1; i <=30; i++) {
			%>
			<td><%=i%></td>
			<%
			}
			%>
		</tr>
	</table>
	<p>
	<table border='1'>
		<tr>
			<%
			for (int i = 1; i <= 30; i++) {
				out.print("<td>" + i + "</td>");
			}
			%>
		</tr>
	</table>

</body>