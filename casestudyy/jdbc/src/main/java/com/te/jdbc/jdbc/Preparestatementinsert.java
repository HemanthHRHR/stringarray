package com.te.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparestatementinsert {

	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement ps =null;
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=1234");
			 ps = con.prepareStatement("insert into biscuit values(?,?)");
			 ps.setInt(1, 3);
			 ps.setString(2, "cream ");
			 ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
