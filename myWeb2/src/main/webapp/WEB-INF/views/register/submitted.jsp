<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>응답결과</h3>
<c:forEach items="${svy.response}" var="sv" varStatus="st">
	<!-- count번 문제의 답을 반복한다. -->
	<!-- varStatus의 1부터의 순서. -->
	<!-- varStatus : 상태변수 -->
	${st.count}번 문제. ${sv}<br>
</c:forEach>
이름 ${svy.respondent.name} <br>
나이 ${svy.respondent.age} <br>
</body>
</html>