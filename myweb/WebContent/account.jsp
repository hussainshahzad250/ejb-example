<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Statefull Example</title>
</head>
<body>
	<form action="/myweb/PerformServlet" method="post">
		Enter Amount:<input type="text" name="amount" /><br> Choose
		Operation: <br /> <input type="radio" name="operation"
			value="deposit" />Deposit<br /> <input type="radio"
			name="operation" value="withdraw" />Withdraw<br /> <input
			type="radio" name="operation" value="checkbalance" />Check balance<br />
		<br> <input type="submit" value="submit">
	</form>
</body>
</html>