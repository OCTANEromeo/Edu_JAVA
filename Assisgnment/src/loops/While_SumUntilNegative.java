package loops;
import java.util.Scanner;
public class While_SumUntilNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the positive numbers and at negative number loops stops");
		int num;
		while(true) {
			System.out.println("enter the num ");
			num=sc.nextInt();
			if(num<0) break;
			totalSum+=num;
		}
		System.out.println("The total num : "+totalSum);
		

	}

}
