package com.srk.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class Read_db {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		String login_success="Fail";
		try {
			System.out.println("Entering DB area");
			String password="";
			String user_name="test";
            if (args[0]!=""){
            	user_name=args[0];
            	password=args[1];
            }
            System.out.println("Creating object");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("This is not gonna be printed");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SSDI", "root", "root");
            System.out.println("Neither is this");
            Statement st =con.createStatement();
            String sql = ("SELECT passwd,is_agent FROM SSDI.LoginInfo where User_Name='"+user_name+"';");
            ResultSet rs = st.executeQuery(sql);
            System.out.println(sql);
            String passwd ="";
            int is_agent=0;
            System.out.println("Before getting");
            if(rs.next()) { 
            	
                passwd = rs.getString("passwd");
                is_agent=Integer.parseInt(rs.getString("is_agent"));
                System.out.println(passwd);
                System.out.println(password);
                System.out.println(is_agent);
            }
            
            System.out.println("After IF and getting");
            System.out.println("Before checking");
            if (passwd.equals(password)){
            	
            	login_success="Pass";
            	if (is_agent==1){
            		login_success="Agent";
            	}
            	System.out.println("Login Success");
            }
            System.out.println(login_success);
            System.out.println("Login Module ends");
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }		
		return login_success;

	}

}
