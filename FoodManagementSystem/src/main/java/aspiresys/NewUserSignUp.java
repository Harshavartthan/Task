package aspiresys;

import jakarta.servlet.RequestDispatcher;
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
 * Servlet implementation class NewUserSignUp
 */
public class NewUserSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodManagement","root","Aspire@123");
			String userName = request.getParameter("Newusername");
			PreparedStatement preState=con.prepareStatement("SELECT * FROM UserAllDetails WHERE Username=?");
			preState.setString(1, userName);
			ResultSet rSet=preState.executeQuery();
			 if (rSet.next())
			 {	
				 RequestDispatcher reqdis = request.getRequestDispatcher("ExistingUser.jsp");
				 reqdis.forward(request, response);
			 }
			 else{
				 String fullName = request.getParameter("FullName");
			     String initial = request.getParameter("initial");
			     String username = request.getParameter("Newusername");
			     String password = request.getParameter("password");
			     String email = request.getParameter("email");
			     String mobilenumber = request.getParameter("Mobilenumber");
 
			        // JDBC connection parameters
			        // Insert user details into the database
			     String sql = "INSERT INTO UserAllDetails (Fullname, Initial, Username, NewUserPassword, Email, PhoneNumber) VALUES (?, ?, ?, ?, ?, ?)";
			     try (PreparedStatement statement = con.prepareStatement(sql)) {
			        statement.setString(1, fullName);
			        statement.setString(2, initial);
			        statement.setString(3, username);
			        statement.setString(4, password);
			        statement.setString(5, email);
			        statement.setString(6, mobilenumber);
			        
 
			        statement.executeUpdate();
			      }
			     RequestDispatcher reqdis = request.getRequestDispatcher("NewUserSuccessLogin.jsp");
				 reqdis.include(request, response);
			}
		}
		catch(Exception e) {
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
