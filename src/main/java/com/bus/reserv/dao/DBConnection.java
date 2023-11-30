package com.bus.reserv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String dbUrl = "jdbc:mysql://localhost:3306/jeedemo";
	private static final String userName = "root";
	private static final String password = "root@123";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(dbUrl, userName, password);
	}

}
