<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm.jsp</title>
</head>
<body>
<h3>설문조사</h3>
<form method = "post">

<c:forEach items="${questions}" var="qu" varStatus="qt"> <br><br>
	[문제 ${qt.count}. ${qu.title}]<br>
	<c:if test="${not empty qu.options }">
		<c:forEach items="${qu.options}" var="op" varStatus="ot">
		  ${ot.count}.
		  	<input type="radio" 
				   name="response[${qt.index}]" 
				   value="${op}">${op}  &nbsp;&nbsp;  
		</c:forEach>
	</c:if>
	<c:if test="${empty qu.options }">
		<input type="text" name="response[${qt.index}]">
	</c:if>
</c:forEach><br><br>


<!--
1. 당신의 역할은? <br>
<input type="radio" name="response[0]" value="server">서버

 <input type="radio" name="response[0]" value="front">프론트
<input type="radio" name="response[0]" value="fullstack">풀스택 <br>

2. 개발도구는?<br>
<input type="radio" name="response[1]" value="eclipse">eclipse
<input type="radio" name="response[1]" value="intellij">intellij
<input type="radio" name="response[1]" value="subime">subime<br>

3. 하고싶은 말은?<br>
<input type="text" name="response[2]"><br> 
-->

이름 <input type="text" name="respondent.name"><br>
나이 <input type="text" name="respondent.age"><br>

<button>전송</button>

</form>
</body>
</html>