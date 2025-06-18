package conditional_statement;
import java.util.*;
public class Cel_To_Feh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celsius");
		double cel=sc.nextDouble();
		double fah=1.8*(cel)+32;
		System.out.println("Fahrenheit :" +fah);
	}
}
