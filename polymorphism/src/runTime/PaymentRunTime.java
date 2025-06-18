package runTime;

public class PaymentRunTime {
	void pay() {
		System.out.println("generic payment");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentRunTime payment;
		payment=new CreditCardPayment();
		payment.pay();
		payment=new UpiPayment();
		payment.pay();
	}

}

class CreditCardPayment extends PaymentRunTime{
	void pay() {
		System.out.println("payment by creditcard");
	}
}
class UpiPayment extends PaymentRunTime{
	void pay() {
		System.out.println("payment by UPI");
	}}
