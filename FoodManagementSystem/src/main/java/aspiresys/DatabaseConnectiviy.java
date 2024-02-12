package aspiresys;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class DatabaseConnectiviy extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DatabaseConnectiviy() {
        super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodManagement", "root", "Aspire@123");
            String name = request.getParameter("username");
            String password = request.getParameter("userpassword");
 
            // Validation for username (starts with a capital letter)
//            if (!name.matches("[A-Z][a-zA-Z]*")) {
//                PrintWriter out = response.getWriter();
//                response.setContentType("/text.html");
//                out.println("<h1>Invalid User</h1>");
//                return;
//            }
 
            // Validation for password (contains at least one uppercase letter and one digit)
//            if (!password.matches("^(?=.*[A-Z])(?=.*\\d).+$")) {
//            	PrintWriter out = response.getWriter();
//                response.setContentType("/text.html");
//                out.println("<h1>Invalid User Password</h1>");
//                return;
//            }
 
            PreparedStatement preState = con.prepareStatement("SELECT * FROM UserAllDetails WHERE Username=? AND NewUserPassword=?");
 
            preState.setString(1, name);
            preState.setString(2, password);
            ResultSet reSet = preState.executeQuery();
 
            if (reSet.next()) {
            
                response.sendRedirect("ShowFood.jsp");
            } else {
            
//            	 PrintWriter out = response.getWriter();
//                 response.setContentType("/text.html");
//                 out.println("<h1>Invalid User Login Credentilas</h1>");
            	response.sendRedirect("ErrorPage.jsp");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}