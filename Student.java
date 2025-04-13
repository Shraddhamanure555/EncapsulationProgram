package com.basicqueations;
/*Create a class Student with private fields: id, name, and marks.
Provide public getter and setter methods.
In the main class, create a Student object, set values using setters, and display them using getters.
*/
public class Student {

	private int id;
	private String name;
	private int marks;
	
	
	public int getResult(){
		
		return marks;
	}
	
	public void setMarks(int marks){
		this.marks = marks;
	}
}
/*public int getAccNo() { 
	// int b = a.getAccNo();
		return accNo; // 24
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}*/
