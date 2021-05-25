<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<h1>Average Of 2 Numbers</h1>
	Number 1:<% out.println(request.getAttribute("number1")); %>
	Number 2:<% out.println(request.getAttribute("number2"));%>
	Result: <% out.println(request.getAttribute("averageResult"));%>
</body>
</html>