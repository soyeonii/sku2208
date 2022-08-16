<%@page import="kr.ac.sku.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member update form</title>
</head>
<body>
<%String id = request.getParameter("id");%>
<h1>회원수정</h1>
	<form action="memberUpdate" method="post">
		아이디 : <input type="text" name="id" value=<%=id%> readonly>
		<br/>
		이름 : <input type="text" name="name">
		<br/>
		비밀번호 : <input type="password" name="password">
		<br/>
		이메일 : <input type="email" name="email">
		<br/>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
</body>
</html>