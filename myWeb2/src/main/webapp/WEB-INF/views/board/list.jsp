<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/list</title>
<style type="text/css">
	.board {display: inline-block;}
	.title{width: 10%}
	.contents{width: 10%}
	.wdate{width: 15%}
	.no, .writer, .replyCnt { width : 5%}
</style>
</head>
<body>
<h3>게시판</h3>
<a href="insert">게시글 작성</a>
<br><br>
<form name="searchFrm">
	<select name="gubun">
		<option value="writer" 	 <c:if test="${search.gubun == 'writer'}">selected</c:if> >작성자
		<option value="title" 	 <c:if test="${search.gubun == 'title'}">selected</c:if> >제목
		<option value="contents" <c:if test="${search.gubun == 'contents'}">selected</c:if> >내용
	</select>
	<input name="keyword" value="${search.keyword}">
	
	작성일자
	<input name="from" type="date" value="${search.from}">
	<input name="to" type="date" value="${search.to}">
	<%-- <input name="wdate" value="${search.wdate}"> --%>
	
	<input type="hidden" name="page" value="1">
	<button>검색</button>
</form>
<br><br>
<c:forEach items="${list}" var="lv">
	<div>
		<span class="board no">${lv.no}</span> 
		<span class="board title"><a href="detail/${lv.no}">${lv.title}</a></span>
		<span class="board contents">${lv.contents}</span>
		<span class="board writer">${lv.writer}</span>
		<span class="board wdate">${lv.wdate}</span>
		<span class="board replyCnt">${lv.replyCnt}</span>
		<br><br>
	</div>
</c:forEach>
<!-- 페이징 -->
</body>
<my:paging paging="${paging}" jsFunc="goboard"></my:paging>

<script>
	function goboard(p) {
		/* location.href="list?page="+p; */
		searchFrm.page.value = p;
		searchFrm.submit();
	}	
</script>

</html>