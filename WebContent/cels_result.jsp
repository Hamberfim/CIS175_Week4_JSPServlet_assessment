<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Fahrenheit temperature in Celsius</title>
</head>
<body>
	<h1>Your Fahrenheit temperature in Celsius Results</h1>
	<p> Converting ${toCelsius.getFahrTemp()} results in ${toCelsius.ConvertToCelsius(toCelsius.getFahrTemp())} Celsius.</p>
	<br />
	<a href="index.jsp">Convert another temperature.</a>

</body>
</html>