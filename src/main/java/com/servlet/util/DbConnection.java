package com.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
               
	public static Connection getConnector() {
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");    // to load driver class and this forName present in com.cj.driver class
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}    
		return con;
		
	}
}
