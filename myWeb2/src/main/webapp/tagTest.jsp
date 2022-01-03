<%@page import="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tagTest.jsp</title>
</head>
<body>
	<%-- <my:select></my:select> --%>
	<select>
		<option>선택
		<my:select items='<%=  Arrays.asList("인사", "IT", "테스트") %>'/>
	</select>
</body>
</html>