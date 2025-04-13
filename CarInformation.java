package com.basicqueations;
import java.util.Scanner;

/*3.
 * Create a class Car with fields: model, year, and price.
Ensure price cannot be set below zero.
Create a method to display car details.*/
public class CarInformation {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the CAR price: ");
	int cname = sc.nextInt();
	
	System.out.println("Enter the CAR Model: ");
	String cmodel = sc.next();
	
	System.out.println("Enter the CAR Year: ");
	int Year = sc.nextInt();
	
	//This is object of car class
	Car cr = new Car();
	cr.setdetails(cname,cmodel,Year);
	
	System.out.println("Car Price: " + cr.getPrice());
	System.out.println("Car Model:" + cr.getmodel());
	System.out.println("Car Year: " + cr.getyear());
}
}
/*
 * 			========Output====
			 Enter the CAR price: 
			10500
			Enter the CAR Model: 
			kia
			Enter the CAR Year: 
			2025
			price  
			Car Price: 10500.0
			Car Model:kia
			Car Year: 2025
*/
