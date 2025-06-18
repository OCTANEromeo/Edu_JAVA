package edu_package;
//import java.util.Scanner;
public class Car_class {
	int speed=100;
	String brand;// Field of data
	Car_class(String b,int s){
		brand=b;
		speed=s;
	}//constructor
	void details() {
		if(speed>150)brand="lambo";
		System.out.println("speed: "+speed+" brand:"+brand);
	}
	
	public static void main(String args[]) {
		Car_class volvo=new Car_class("Volvo",120);
		Car_class nissan=new Car_class("nissan",140);
		Car_class lambo=new Car_class("lambo",180);
		volvo.details();
		nissan.details();
		lambo.details();
	}
}
