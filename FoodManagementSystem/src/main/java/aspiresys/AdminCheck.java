package aspiresys;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class AdminCheck
 */
public class AdminCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodManagement", "root", "Aspire@123");
            String name = request.getParameter("AdminName");
            String password = request.getParameter("Adminpassword");
 
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
 
            PreparedStatement preState = con.prepareStatement("SELECT * FROM AdminDetails WHERE Adminname=? AND AdminPassword=?");
 
            preState.setString(1, name);
            preState.setString(2, password);
            ResultSet reSet = preState.executeQuery();
 
            if (reSet.next()) {
            
                response.sendRedirect("FoodAndUserDetails.jsp");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
