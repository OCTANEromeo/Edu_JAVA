package loops;
import java.util.Scanner;
public class While_PasswordLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pass;
		while(true) {
			System.out.println("Enter the password");
			pass=sc.nextLine();
			if(pass.equals("java123")){
			System.out.println("Login Successful");
			break;
			}else {
				System.out.println("Wrong password!, Retry again");
			}
		}
	}
}
