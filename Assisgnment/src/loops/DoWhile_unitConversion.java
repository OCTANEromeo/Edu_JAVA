package loops;
import java.util.Scanner;
public class DoWhile_unitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1.Celsius to Fahrenheit");
			System.out.println("2.Kilometers to Miles");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter celsius");
				double cel=sc.nextDouble();
				double fah=(cel * 9/5)+32;
				System.out.println("Fahrenheit : "+fah);
				break;
			case 2:
				System.out.println("Enter Kilometers");
				double km=sc.nextDouble();
				double miles=km * 0.62;
				System.out.println("Miles : "+miles);
				break;
			case 3:
				System.out.println("Exiting the program");
				break;
			default:
				System.out.println("Enter a proper choice");
			}
		}while(choice!=3);
	}

}
