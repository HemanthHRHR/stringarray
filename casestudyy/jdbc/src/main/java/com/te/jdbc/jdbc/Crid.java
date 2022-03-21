package com.te.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Crid {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=1234");
			st = con.createStatement();
			//boolean execute = st.execute("create table biscuit(id int,name varchar(40))");
			//boolean execute2 = st.execute("insert into biscuit values(4,'borborn')");
		//	st.execute("update biscuit set name ='chaskamaska' where id=1");
			//st.execute("delete from biscuit where id=3");
			ResultSet executeQuery = st.executeQuery("select * from biscuit");
			while(executeQuery.next()) {
				System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
