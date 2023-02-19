package com.packages;

import java.sql.Connection;

import java.sql.DriverManager;

public class DatabaseCon {
	public static Connection establishConnection()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:4444/mca","root","root");
		return con;
	}

}
