package conditional_statement;
import java.util.*;
public class Max_score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score for 3 participants");
		int  p1=sc.nextInt();
		int p2=sc.nextInt();
		int p3=sc.nextInt();
		int res=Math.max(p1,Math.max(p2, p3));
		System.out.println("Largest elem is :"+res);
	
	}
}
