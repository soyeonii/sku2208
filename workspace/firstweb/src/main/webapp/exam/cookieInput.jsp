<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookie cookie = new Cookie("login", "lee");
cookie.setPath("/");
cookie.setMaxAge(-1);

response.addCookie(cookie);
%>