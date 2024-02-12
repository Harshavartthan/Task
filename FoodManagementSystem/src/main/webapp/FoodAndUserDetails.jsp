<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>
<style>
	.buttonclick {
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 30px;
			font-style: oblique;
			background-color: rgb(255, 128, 64);
		}
		body 
		{
			font-family: Serif;
			background-color: #f4f4f4;
			margin: 0;
			padding: 0;
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100vh;
			font-size: 30px;
			text-align: center;
		}
		
</style>
</head>
<body>

<div>
<p>Welcome Admin</p><br><br>
<a class="buttonclick" href="ShowFood.jsp">Click here to see Food Details</a><br><br><br><br>
<a class="buttonclick" href="ShowUser.jsp">Click here to see User Details</a></div>

</body>
</html>