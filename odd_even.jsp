<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Odd Even</title>
</head>
<body>
	<% //Scriptlet
	int x = Integer.parseInt(request.getParameter("num"));
	if(x%2==0){
		out.println("<h1>"+x+" is an even number</h1>");
	}
	else{
		out.println("<h1>"+x+" is an odd number</h1>");
	}
	%>
</body>
</html>