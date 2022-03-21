package com.te.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Getalldatausingprepare {

	public static void main(String[] args) {
		Connection con =null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=1234");
		PreparedStatement prepareStatement = con.prepareStatement("select * from biscuit");
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
