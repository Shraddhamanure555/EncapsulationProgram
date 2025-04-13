package com.basicqueations;
/*
 * 4. Create a class Employee with fields: empId, empName, salary.
Use getter and setter methods.
If salary is set below 10,000, it should display a warning message.*/
public class Employees {

	private int empId;
	private String empName;
	private int Salary;
	
	public int getSalary() {
		if (Salary < 10000&& Salary>=10000) {
			System.out.println("Please enter correct salary : "+ Salary);
			
		}
		else {
			System.out.println(" Your Salary_____"+Salary);
		}
		return Salary;
		
	}
	
	public void setEMP(int empId) {
//		this.empId = empId;
		this.Salary= Salary;
//		this.empName =empName;
		
		System.out.println("********EMPLOYEE DETAILS********");
//		System.out.println("Employee id: "+empId);
//		System.out.println("Employee Name: " + Salary);
//		System.out.println("Employee Name: " +empName );
		
	}
	
}

//public int getAccNo() { 
//	// int b = a.getAccNo();
//		return accNo; // 24
//	}
//
//	public void setAccNo(int accNo) {
//		this.accNo = accNo;
//	}
