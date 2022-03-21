package com.te.casestudy.jdbccases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class EmployeeDAO {
	static Connection connection = null;
      PreparedStatement  preparedStatement =null;
	public static Connection getConnection() {
		try {
			FileReader fileReader = new FileReader("database.properties.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			return connection = DriverManager.getConnection(properties.getProperty("Db_Url"),
					properties.getProperty("Db_Username"),properties.getProperty("Db_Password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
