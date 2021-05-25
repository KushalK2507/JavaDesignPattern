<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Ticket</title>
</head>
<body>
<form action="createTicket" method="post">
Movie Name : <input type="text" name="movieName"/>
Screen : <input type="text" name="screenNo"/>
Seat : <input type="text" name="seatNo"/>
<input type="Submit" value="Book Ticket"/>
</form>
${msg}
</body>
</html>