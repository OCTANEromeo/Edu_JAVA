package conditional_statement;
import java.util.*;
public class Bank_loan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		float pri=sc.nextFloat();
		System.out.println("Enter the annual interest rate(in percentage)");
		float inrate=sc.nextFloat();
		System.out.println("Enter the Duration in years");
		float years=sc.nextFloat();
		System.out.println("The simple interest is :"+((pri*inrate*years)/100));
	}
}
