<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.core.Authentication" %>



<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<%
Authentication auth = SecurityContextHolder.getContext().getAuthentication();
Object principal = auth.getPrincipal();
String name = "";
if(principal != null) {
    name = auth.getName();
}

%>
	<sec:authorize access="isAuthenticated()">
	    <form action="/logOut.do" method="POST">
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	          <h5><%=name %>님, 반갑습니다.</h5>

	        <button type="submit">LOGOUT</button>
	        <p><sec:authentication property="principal.username"/>님, 반갑습니다.</p>

	    </form>
	</sec:authorize>
</body>
</html>
