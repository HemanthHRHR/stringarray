package com.te.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareUpdate {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement ps = null;
		
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=1234");
		ps = con.prepareStatement("update biscuit set name=? where id=?");
		ps.setInt(1, 1);
		ps.setString(1, "sxsa");
		int executeUpdate = ps.executeUpdate();
		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enetr the valuse");
//	String next = sc.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
