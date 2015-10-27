package com.srk.pkg;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Statement;


/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//out.println("Entering into Registration");
	    String user_name=request.getParameter("username");
	    String firstname=request.getParameter("firstname");
	    String lastname=request.getParameter("lastname");
	    String emailid=request.getParameter("emailid");
	    String password=request.getParameter("password");
		//out.println("We have received the request");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SSDI", "root", "root");
            Statement st =con.createStatement();
            String sql = ("INSERT into SSDI.LoginInfo values('"+firstname+"','"+lastname+"','"+emailid+"','"+user_name+"','"+password+"');");
            //out.println("");
            out.println(sql);
            out.print(st.executeUpdate(sql));
            out.println(sql);
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);

	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
