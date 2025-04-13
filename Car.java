package com.basicqueations;
/*3. 
 * Create a class Car with fields: model, year, and price.
Ensure price cannot be set below zero. ????? aking about this line below zero means
Create a method to display car details.
*/
public class Car {
private int price;
private String model;
private int year;
//1nd method of price which is private fields
public int getPrice() {
	
	if(price > 0 || price < 0) {
		System.out.println("Car price:  ");
	}
	else{
		System.out.println("price cannot in negative value or Invalid: ");
	}
	return price;//return the price in double 
}
//2nd method of model which is private fields
public String getmodel() {
return model;	
}

// 3rd method of year which is private fields
public int getyear() {
	return year;
}



public void setdetails(int price,String model,int year) {
	this.price= price;
	this.model=model;
	this.year=year;
	
}

}
