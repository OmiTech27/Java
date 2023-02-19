<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Process</title>
</head>
<body>
<h1>Form Process</h1>
    <p>Name: <c:out value="${param.sname}" /></p>
    <p>Name: <c:out value="${param.cname}" /></p>
    <p>Email: <c:out value="${param.email}" /></p>
</body>
</html>
