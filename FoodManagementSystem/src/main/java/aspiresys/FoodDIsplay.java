///*package aspiresys;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.mysql.cj.xdevapi.Statement;
//
///**
// * Servlet implementation class FoodDIsplay
// */
//public class FoodDIsplay extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public FoodDIsplay() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            // Step 1: Establish a connection to the database
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodManagement", "root", "Aspire@123");
//            
//            // Step 2: Write SQL Query
//            String query = "SELECT * FROM FoodDetails";
//            
//            // Step 3: Retrieve Data
//            stmt = (Statement) conn.createStatement();
//            rs = ((java.sql.Statement) stmt).executeQuery(query);
//            
//            // Step 4: Store data in a list
//            List<Food> foodList = new ArrayList<>();
//            while (rs.next()) {
//                Food food = new Food();
//                food.setFoodId(rs.getInt("FoodId"));
//                food.setFoodName(rs.getString("FoodName"));
//                food.setFoodPrice(rs.getDouble("FoodPrice"));
//                foodList.add(food);
//            }
//
//            // Step 5: Pass data to JSP
//            request.setAttribute("foodList", foodList);
//
//            // Step 6: Forward the request to JSP
//            request.getRequestDispatcher("food.jsp").forward(request, response);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close resources
//            try {
//                if (rs != null) rs.close();
//                if (stmt != null) stmt.close();
//                if (conn != null) conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        out.println("</body></html>");
//    }
//}
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
