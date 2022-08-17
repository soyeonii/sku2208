<%@page import="kr.ac.sku.dto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member list</title>
</head>
<body>
	<%
	List<MemberDTO> memberList = (List<MemberDTO>) request.getAttribute("memberList");
	%>
	<h1>회원 목록!!</h1>
	<table>
		<th>이름</th>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이메일</th>
		<th>가입일</th>
		<th>수정</th>
		<th>삭제</th>
		<%
		if (memberList != null) {
			for (MemberDTO member : memberList) {
		%>
		<tr>
			<td><%=member.getName()%></td>
			<td><%=member.getId()%></td>
			<td><%=member.getPassword()%></td>
			<td><%=member.getEmail()%></td>
			<td><%=member.getJoinDate()%></td>
			<td><a href="memberUpdateForm.jsp?id=<%=member.getId()%>">수정</a>
			<td><a href="memberDelete?id=<%=member.getId()%>">삭제</a>
		</tr>
		<%
		}
		}
		%>
	</table>
</body>
</html>