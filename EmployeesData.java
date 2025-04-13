package com.basicqueations;
/*
 * 4. Create a class Employee with fields: empId, empName, salary.
Use getter and setter methods.
If salary is set below 10,000, it should display a warning message.*/
public class EmployeesData {
public static void main(String args[]) {
	Employees emp = new Employees();
	emp.setEMP(9000) ;
	System.out.println("Your salary: "+emp.getSalary());
}
}
