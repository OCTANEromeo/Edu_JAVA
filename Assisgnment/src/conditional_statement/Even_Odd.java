package conditional_statement;
import java.util.*;
public class Even_Odd {
	public static void main(String[] args) {
		System.out.println("Enter postive integer to check even or odd");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=1) {
			if(num%2==0)System.out.println("Even");
			else System.out.println("Odd");
		}
	}
}
