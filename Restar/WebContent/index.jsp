<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="./indexServlet" >
	<table border="0">
		<tr>
			<td>Primer n�mero:</td>
			<td><INPUT name="param1"></td>
		</tr>
		<tr>
			<td>Segundo n�mero:</td>
			<td><INPUT name="param2"></td>
		</tr>
		<tr>
		<td><input type="submit" value="Restar"></td>
		</tr>
	</table>
</form>
</body>
</html>