<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
    <h3>LoginForm</h3>
    <form name="LoginForm" action="/loginAction" method="POST">
        <table>
            <tbody>
                <tr>
                    <td>Userasd:</td>
                    <td><input type="text" name="user_id" value=""></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="user_pwd"></td>
                </tr>
                <tr>
                    <td colspan="2"><input name="submit" type="submit" value="Login"></td>
                </tr>
                <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}">
            </tbody>
        </table>
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		<font color="red">
			<p>
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</p> <c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session" />
			</font>
		</c:if>



	</form>
</body>
</html>