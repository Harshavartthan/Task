<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style>
		.divbox 
		{
			text-align: center;
		}
		form 
		{
			background-color: #fff;
			padding-top: 50px;
			padding-right: 50px;
			padding-left: 50px;
			padding-bottom: 50px;
			border-radius: 150px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
			width: 300px;
			display: inline-block;
		}
		label 
		{
			font-weight: bold;
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
			font-size: 20px;
		}
		input[type="text"], input[type="password"] 
		{
			width: 100%;
			padding: 4px;
			margin-top: 5px;
			margin-bottom: 15px;
			border: 2px solid rgb(255, 128, 64);
			border-radius: 30px;
			box-sizing: content-box;
			height: 30px; 
		}
		.buttonclick 
		{
			
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 3px;
			font-style: oblique;
			background-color: rgb(255, 128, 64);
		}
		div {
		  
		  border: 5px solid rgb(255, 128, 64);
		  padding: 0px;
		  margin: 1px;
		}
		.buttonclick :hover 
		{
			background-color: #45a049;
		}
</style>
</head>
<body>
	<div class="divbox">
		<form action = 'AdminCheck' method="post">
			<h2>Admin Login</h2>
			<label for="adminname">Admin Name</label>
			<br> 
			<input type="text" id="adminname" name="AdminName" required>
			<br> 
			<br>
			<label for="password">Password</label>
			<br> 
			<input type="password" id="password" name="Adminpassword" required>
			<br>
			<input class="buttonclick" type="submit" value="Login" target="_blank"> 
			<br>
		</form>
	</div>
</body>
</html>