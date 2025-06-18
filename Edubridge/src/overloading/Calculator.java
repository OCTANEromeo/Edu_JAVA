package overloading;
import java.util.Scanner;

public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		   System.out.println("Enter two integers:");
	        int x = sc.nextInt(), y = sc.nextInt();
	        System.out.println("Sum : " + cal.add(x, y));

	        System.out.println("Enter two decimal numbers:");
	        double d1 = sc.nextDouble(), d2 = sc.nextDouble();
	        System.out.println("Sum : " + cal.add(d1, d2));

	        System.out.println("Enter three integers:");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
	        System.out.println("Sum : " + cal.add(a,b,c));
		

	}

}
