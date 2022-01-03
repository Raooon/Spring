<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="items" required="true" type="java.util.List" %>

<!-- <select>
	<option>개발
	<option>인사
	<option>총무
</select> -->

	<c:forEach items="${items}" var="op">  <option>${op} </c:forEach>