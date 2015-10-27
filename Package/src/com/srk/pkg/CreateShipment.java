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
 * Servlet implementation class CreateShipment
 */
public class CreateShipment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateShipment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//out.println("Entering into Registration");
		String No_of_Packages,Item1,Package_Declared_Value,to_company,to_contact,to_country,to_state,to_city,
		to_addressline1,to_addressline2,to_zipcode,to_email,from_company,from_contact,from_country,from_state,
		from_city,from_addressline1,from_addressline2,from_zipcode,from_email,Pickup;
		No_of_Packages=request.getParameter("No_of_Packages");
		Item1=request.getParameter("Item1");
		Package_Declared_Value=request.getParameter("Package_Declared_Value");
		to_company=request.getParameter("to_company");
		to_contact=request.getParameter("to_contact");
		to_country=request.getParameter("to_country");
		to_state=request.getParameter("to_state");
		to_city=request.getParameter("to_city");
		to_addressline1=request.getParameter("to_addressline1");
		to_addressline2=request.getParameter("to_addressline2");
		to_zipcode=request.getParameter("to_zipcode");
		to_email=request.getParameter("to_email");
		from_company=request.getParameter("from_company");
		from_contact=request.getParameter("from_contact");
		from_country=request.getParameter("from_country");
		from_state=request.getParameter("from_state");
		from_city=request.getParameter("from_city");
		from_addressline1=request.getParameter("from_addressline1");
		from_addressline2=request.getParameter("from_addressline2");
		from_zipcode=request.getParameter("from_zipcode");
		from_email=request.getParameter("from_email");
		Pickup=request.getParameter("Pickup");
		//out.println("We have received the request");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SSDI", "root", "root");
            Statement st =con.createStatement();
            String sql = ("INSERT into SSDI.Request values"
            		+ "('"+No_of_Packages+"','"+Item1+"','"+Package_Declared_Value+
            		"','"+to_company+"','"+to_contact+"','"+to_country+"','"+to_state+
            		"','"+to_city+"','"+to_addressline1+"','"+to_addressline2+"','"+to_zipcode+
            		"','"+to_email+"','"+from_company+"','"+from_contact+"','"+from_country+
            		"','"+from_state+"','"+from_city+"','"+from_addressline1+"','"+
            		from_addressline2+"','"+from_zipcode+"','"+from_email+"','"+Pickup+"',0);");
            //out.println("");
            out.println(sql);
            out.print(st.executeUpdate(sql));
            out.println(sql);
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
		out.println("Registration Done");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
