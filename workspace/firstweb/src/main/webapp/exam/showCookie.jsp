<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 쿠키 가져오기
	Cookie[] cookies = request.getCookies();
	%>
	<table>
		<tr>
			<th>쿠키 이름</th>
			<th>쿠키 값</th>
			<th>쿠키 삭제</th>
		</tr>
		<%
		if (cookies != null) {
			for (Cookie cookie : cookies) {
		%>
		<tr>
			<td><%=cookie.getName()%></td>
			<td><%=cookie.getValue()%></td>
			<td><a href="cookieDelete.jsp?cookieName=<%=cookie.getName()%>">쿠키 삭제</a></td>
		</tr>
		<%
		}
		}
		%>
	</table>
</body>
</html>