<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NUMBER OF TABLE</title>
</head>
<body>
<% 
  // JSP scriptlet 
  int num = Integer.parseInt(request.getParameter("n1")); 
%>
<h1>Multiplication Table</h1>
    <table border="1">
      <tr>
        <th>Number</th>
        <th>Multiplication Table</th>
      </tr>
      <% 
        // JSP scriptlet 
        for (int i = 1; i <= 10; i++) { 
      %>
      <tr>
      	<!-- JSP Expressions -->
        <td><%= num %></td>
        <td><%= num * i %></td>
      </tr>
      <% 
        } 
      %>
    </table>
</body>
</html>
