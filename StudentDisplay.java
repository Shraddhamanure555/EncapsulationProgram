package com.basicqueations;
/*1.Create a class Student with private fields: id, name, and marks.
Provide public getter and setter methods.
In the main class, create a Student object, set values using setters, and display them using getters.
*/
import java.util.Scanner;
public class StudentDisplay {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student Marks: ");
	int a=sc.nextInt();
	Student stu = new Student();
	stu.setMarks(a);
	System.out.println("This is the Student Marks: "+stu.getResult());
}
}
