<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>확점 학인 프로그램 JSP</title>

</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	//request는 내장객체!!!!
	response.setContentType("text/html; charset=utf-8");

	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int python = Integer.parseInt(request.getParameter("python"));
	int db = Integer.parseInt(request.getParameter("db"));

	int total = java + web + python + db;
	double avg = total / 4.0;

	String grade;

	if (avg >= 90) {
		grade = "A";
	} else if (avg >= 80) {
		grade = "B";
	} else if (avg >= 70) {
		grade = "C";
	} else if (avg >= 60) {
		grade = "D";
	} else {
		grade = "F";
	}
	%>
	<form>
		<fieldset>
			<legend>학점 확인 프로그램</legend>
			<table align="center">
				<tr>
					<td>이름</td>
					<td><%=name%></td>
				</tr>
				<tr>
					<td>Java점수</td>
					<td><%=java%></td>
				</tr>
				<tr>
					<td>Web점수</td>
					<td><%=web%></td>
				</tr>
				<tr>
					<td>Python점수</td>
					<td><%=python%></td>
				</tr>
				<tr>
					<td>DB점수</td>
					<td><%=db%></td>
				</tr>
				<tr>
					<td>평균</td>
					<td><%=avg%></td>
				</tr>
				<tr>
					<td>학점</td>
					<td><b><%=grade%></b></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>