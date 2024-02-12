<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin</title>

<style>
		h2 {
			text-align:center;
		}
		table {
		  width: 100%;
		}
		
		th {
		  height: 70px;
		  background-color: rgb(255, 128, 64);
		  border-radius: 30px;
		}
		td {
		  text-align: center;
		  height: 50px;
		  vertical-align: center;
		  border-radius: 30px;
		}
		tr:nth-child(even) {
		background-color: #f2f2f2;
		}
		h4
		{
			text-align: center;
		}
		.buttonclick {
			color: white;
			padding: 10px 20px;
			margin-left: 515px;
			border: none;
			border-radius: 30px;
			font-style: oblique;
			background-color: rgb(255, 128, 64);
			text-align: center;
			position: absolute;
  			bottom: 0;
		}
		body
		{
			height: 100vh;
		}
</style>

</head>
<body>
    <h2>User Details</h2>
    <table >
        <tr>
            <th>Full Name</th>
            <th>Initial</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Mobile Number</th>
        </tr>
    <%
        // Establish database connection
        
      Connection conn = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodManagement",  "root", "Aspire@123");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute the query
            String query = "SELECT * FROM UserAllDetails";
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through the result set and print data
            //while (rs.next()) 
           // {
                //out.println("Food ID: " + rs.getInt("FoodId") + "<br>");
                //out.println("Food Name: " + rs.getString("FoodName") + "<br>");
                //out.println("Food Price: " + rs.getInt("FoodPrice") + "<br>");
                //out.println("<br>");
            //}
             while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getString("Fullname")+ "</td>" );
                    out.println("<td>" +  rs.getString("Initial") + "</td>" );
                    out.println("<td>" + rs.getString("Username") + "</td>" );
                    out.println("<td>" + rs.getString("Email") + "</td>" );
                    out.println("<td>" + rs.getString("PhoneNumber") + "</td>" );
                    
                    out.println("</tr>");
                }

            // Close the result set and statement
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
        }
    %>
    
    <a class="buttonclick" href="FoodAndUserDetails.jsp">Go back to AdminPage</a></div><br><br><br><br>
    </table>
</body>
</html>