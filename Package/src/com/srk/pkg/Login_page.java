package com.srk.pkg;
import com.srk.pkg.Read_db;
import javax.servlet.RequestDispatcher;
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
import java.sql.ResultSet;

/**
 * Servlet implementation class Login_page
 */
public class Login_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_page() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String user_name=request.getParameter("j_username");
	    String password=request.getParameter("j_password");
		PrintWriter out=response.getWriter();
		out.println("We have received the request");
		out.println(password);
/*        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SSDI", "root", "root");
            Statement st =con.createStatement();
            String sql = ("SELECT passwd FROM SSDI.LoginInfo where User_Name='"+user_name+"';");
            ResultSet rs = st.executeQuery(sql);
            out.println(sql);
            String passwd ="";
            if(rs.next()) { 
                passwd = rs.getString("passwd");
            }
            out.println(passwd);
            if (passwd==password){
            	out.println("Login Success");
            }
            out.println(passwd);
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }*/
		Read_db news=new Read_db();
		String[] now=new String[2];
		now[0]=user_name;
		now[1]=password;
		String login_success=news.main(now);
        String redirect="index.jsp";
		switch(login_success){
        case "Pass":
        	redirect="user_home.jsp";
        	break;
        case "Agent":
        	redirect="agent_home.jsp";
        	break;
        default:
        	System.out.println("Login Failed");
        }
		
      	request.getRequestDispatcher(redirect).forward(request, response);

	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
