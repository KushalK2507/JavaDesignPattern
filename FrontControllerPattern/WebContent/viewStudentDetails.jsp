<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>All Student below</h1>
	<jsp:useBean id="studentDetails"
		type="com.kushal.patterns.frontController.StudentVO" scope="request" />
	<!-- id should be same defined in StudentVo and name should be id of the useBean-->
	Student Id:<jsp:getProperty property="id" name="studentDetails" />
	Student Name:<jsp:getProperty property="name" name="studentDetails" />
</body>
</html>