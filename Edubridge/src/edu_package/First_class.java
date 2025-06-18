package edu_package;

import java.util.Scanner;

public class First_class {
	public static int add(int res)
	{
		System.out.println(res);
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Scanner sc= new Scanner(System.in);
		//int val1= sc.nextInt();
		int i = 10;
		char c = 'a';
		String str =" I am Gay";
		double f = 50.56;
		long  li= 1234567890;
		System.out.println(str.getClass().getName());
		System.out.println(((Object)i).getClass().getName());
		
		
	}

}
