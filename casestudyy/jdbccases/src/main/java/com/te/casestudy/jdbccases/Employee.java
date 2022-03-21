package com.te.casestudy.jdbccases;

import lombok.Data;

public class Employee {

	int employee_id;
	String name;
	String date_of_birth;
	int salary;

	
	public Employee() {
		super();
	}

	public Employee(int employee_id, String name, String date_of_birth, int salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.salary = salary;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", date_of_birth=" + date_of_birth
				+ ", salary=" + salary + "]";
	}
	

}
