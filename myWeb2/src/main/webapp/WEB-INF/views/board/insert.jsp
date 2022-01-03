<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시글 등록
<c:set />
<form action="insert" method="post">
	Title : 
	<br><input name="title"><br>
	Contents : 
	<br><textarea rows="4" cols="40" name="contents"></textarea><br>
	Writer : 
	<br><input name="writer">
	<button>등록</button>
</form>
</body>
</html>