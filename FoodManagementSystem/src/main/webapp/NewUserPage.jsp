
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New User Registration</title>
    <style>
	    input[type="text"], input[type="password"],input[type="date"],input[type="email"],input[type="Mobilenumber"]
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
			height: 170vh;
			font-size: 20px;
		}
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
			width: 500px;
			display: inline-block;
		}
		.buttonclick {
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 3px;
			font-style: oblique;
			background-color: rgb(255, 128, 64);
		}
		div {
		  
		  border: 10px solid rgb(255, 128, 64);
		  padding: 0px;
		  margin: 1px;
		}
		.buttonclick :hover {
			background-color: #45a049;
		}
    </style>
</head>
<body>
    
    <div class = "divbox">
    <form action='NewUserSignUp' method="post">
    <h2>New User Registration</h2>
    	<label for="FullName">Enter your Name:</label>
        <input type="text" id="FullName" name="FullName" required><br><br>
        <label for="initial">Initial:</label>
        <input type="text" id="initial" name="initial" required><br><br>
        
        <label for="Newusername">Enter your Username:</label>
        <input type="text" id="Newusername" name="Newusername" required><br><br>
        
        <label for="dob">Enter your Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br><br>
        
        <label for="email">Enter your Email ID:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="Mobilenumber">Enter your Mobile Number:</label>
        <input type="Mobilenumber" id="Mobilenumber" name="Mobilenumber" required><br><br>
       
        <label for="password">Create New Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input class="buttonclick" type="submit" value="Register">
    </form>
    </div>
</body>
</html>