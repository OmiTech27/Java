<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try{
		Connection
		con=DatabaseCon.establishConnection();
		PreparedStatement
		ps=con.prepareStatement("insert into registrationdb values(?,?,?,?)");
		ps.setString(1, (request.getParameter("t1")));
		ps.setString(2, (request.getParameter("t2")));
		ps.setInt(3,Integer.parseInt(request.getParameter("t3")));
		ps.setString(4, (request.getParameter("t4")));
		ps.excuteUpdate();
		out.println("Record is added successfully");	
	
	
	}
	catch(Exception ex){
		out.println(ex);

%>

</body>
</html>
