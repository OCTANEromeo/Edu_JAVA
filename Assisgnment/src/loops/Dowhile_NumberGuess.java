package loops;
import java.util.Scanner;
public class Dowhile_NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sec_Num=8;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10");
		do {
			num=sc.nextInt();
			if(Sec_Num == num) {
				System.out.println("Correct Guess");
				System.out.println("Game Over!!");
				break;
			}
			System.out.println("Enter the Number again ");
			
		}while(true);
	}

}
