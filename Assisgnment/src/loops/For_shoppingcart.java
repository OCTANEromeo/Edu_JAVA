package loops;

import java.util.Scanner;

public class For_shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []price=new int[5];
		System.out.println("enter the price for 5 items");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the value for Item "+ (i+1) +" ");
			price[i]=sc.nextInt();
		}
		int Tsum=0;
		for(int i=0;i<price.length;i++) {
			Tsum+=price[i];
		}
		System.out.println("The total sum is "+Tsum);

	}

}
