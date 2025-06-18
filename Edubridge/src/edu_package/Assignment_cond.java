package edu_package;

import java.util.Scanner;

public class Assignment_cond {
	public static void if_cond(int age) {
		if(age>=18) {
			System.out.println("Elgible to Vote");
		}else {
			System.out.println("Not Eligible");
			}
	}
	
	public static void nest_cond(int age,double sal) {
		if(age>=21) {
			if(sal>=25000.00) {
				System.out.println("eligible for loan");
			}
		}else {
			System.out.println("Not eligible for loan");
		}
	}
	public static void switch_cond() {
		System.out.println("Enter the number for menu selection");
		System.out.println("1-Pizza");
		System.out.println("2-burger");
		System.out.println("3-pasta");
		System.out.println("Enter 4 for exit");
		Scanner in=new Scanner(System.in);
		int value=in.nextInt();
		
		switch(value) {
			case 1:
				System.out.println("pizza is ordered");
				break;
			case 2:
				System.out.println("pizza is ordered");
				break;
			case 3:
				System.out.println("pizza is ordered");
				break;
			default:
				System.out.println("End of menu");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if_cond(age);
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		
		nest_cond(age,sal);
		switch_cond();
	}
}
