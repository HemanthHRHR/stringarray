package com.te.casestudy.jdbccases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EmployeeServiceImpl serviceImpl = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter the Employee details");
		
		System.out.println("Enter the id of the Employee");
		employee.setEmployee_id(scanner.nextInt());
		System.out.println("Enter the emoloyee name");
		employee.setName(scanner.next());
		System.out.println("Enter the employee DOB ");
		employee.setDate_of_birth(scanner.next());
		System.out.println("Enter the employee salary");
		employee.setSalary(scanner.nextInt());
		serviceImpl.addEmployee(employee);
		System.out.println("given data SUCCESSFULL");
		System.out.println();

	}

}
