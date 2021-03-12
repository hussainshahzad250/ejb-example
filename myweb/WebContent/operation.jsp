<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum</title>
<style type="text/css">
.table {
	padding-top: 20px;
	padding: 20px;
}
</style>
</head>
<body>
	<div class="table" align="center">
		<form action="/myweb/SumTotal" method="post">
			<table>
				<tr>
					<th>Number1:</th>
					<td><input type="text" name="number1" /></td>
				</tr>
				<tr>
					<th>Number2:</th>
					<td><input type="text" name="number2" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>