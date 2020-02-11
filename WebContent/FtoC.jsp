<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit to Celsius</title>
</head>
<body>
	<h1>Convert Fahrenheit to Celsius</h1>
	<form action="getFahrServlet" method="post">
		<fieldset>
			<legend>Enter the Fahrenheit Temperature:</legend>
			<input type="text" name="fahrTemp" size="5">&nbsp; <input
				type="submit" value="Convert" />
		</fieldset>
	</form>
</body>
</html>