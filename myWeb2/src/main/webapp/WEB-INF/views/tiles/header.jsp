<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<ul>
	  <li><a href="${pageContext.request.servletContext.contextPath}/">home</a></li>
      <li><a href="<%=request.getServletContext().getContextPath()%>/main">main</a></li>
      <li><a href="${pageContext.request.servletContext.contextPath}/board/list">게시판</a></li>
</ul>