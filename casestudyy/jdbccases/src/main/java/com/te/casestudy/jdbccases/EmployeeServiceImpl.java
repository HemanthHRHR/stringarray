package com.te.casestudy.jdbccases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmpoyeeService{
	static PreparedStatement ps= null;

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection connection = EmployeeDAO.getConnection();
		try {
			ps = connection.prepareStatement("insert into Employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmployee_id());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getDate_of_birth());
			ps.setInt(4, employee.getSalary());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

	@Override
	public List<Employee> getAll() {
		String query = "select * from Employee";
		Employee employee = null;
		Connection connection = null;
		Statement statement =null;
		List<Employee> arraylist = new ArrayList<Employee>();
		try {
			connection = EmployeeDAO.getConnection();
			statement = connection.createStatement();
			ResultSet query2 = statement.executeQuery(query);
			employee = new Employee();
			while(query2.next()) {
				employee.setEmployee_id(query2.getInt("employee_id"));
				employee.setName(query2.getString("name"));
				employee.setDate_of_birth(query2.getString("date_of_birth"));
				employee.setSalary(query2.getInt("salary"));
				arraylist.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		return arraylist;
	}

}
