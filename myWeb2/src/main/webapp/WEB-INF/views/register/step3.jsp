<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p>회원가입을 완료했습니다.</p>
가입정보 : <br>
이름 : ${user.name }<br>
이메일 : ${user.email } <br>
<a href="<c:url value='/main'/>">첫 화면 이동</a>


<%-- <c:url value="/main>
	<!--  ?p1 = v1&p2=v2" -->
	<c:param name="p1" value="v1"></c:param>
</c:url> --%>