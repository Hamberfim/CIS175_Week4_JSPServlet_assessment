<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Celsius temperature in Fahrenheit</title>
</head>
<body>
<h1>Your Celsius temperature in Fahrenheit Results</h1>
	<p> Converting ${toFahrenheit.getCelsTemp()} results in ${toFahrenheit.ConvertToFahrenheit(toFahrenheit.getCelsTemp())} Fahrenheit.</p>
	<br />
	<a href="index.jsp">Convert another temperature.</a>
</body>
</html>