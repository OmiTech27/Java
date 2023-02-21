<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!double interest=0.0;%>
<%
double amount=Double.parseDouble(request.getParameter("amount"));
int year=Integer.parseInt(request.getParameter("period"));

if(year >=1 && year <=7)

{

interest=(amount*5.35)/100;
}else if(year>=8 && year <=15)

{

interest=(amount*5.5)/100;
}

else if(year>=16 && year<=30)
{

interest=(amount*5.75)/100;
}else{out.println("Year invalid…");
}
if (interest >= 0){
	out.println("<h1>Yearly Interest ="+interest+ "</h1><br>");
	out.println("<h1>"+"loan balance = "+ (amount+(interest*year)) +"</h1>");
}
%>
</body>
</html>