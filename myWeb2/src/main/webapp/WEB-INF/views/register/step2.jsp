<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test = "${not empty msg}">
  	<script>
	  	alert("${msg}")
  	</script>
 </c:if>
 <div>${msg}</div>
 
<form action="step3" method="post">
	name : <input name="name">
	email : <input name="email">
	password : <input name="password">
	checkPassword : <input name="checkPassword">
	<button>가입완료</button>
</form>
