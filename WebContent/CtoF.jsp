<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celsius to Fahrenheit</title>
</head>
<body>
	<h1>Convert Celsius to Fahrenheit</h1>
	<form action="getCelsServlet" method="post">
		<fieldset>
			<legend>Enter the Celsius Temperature:</legend>
			<input type="text" name="celsTemp" size="5">&nbsp; <input
				type="submit" value="Convert" />
		</fieldset>
	</form>
</body>
</html>