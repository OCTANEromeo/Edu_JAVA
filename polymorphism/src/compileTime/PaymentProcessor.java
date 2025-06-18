package compileTime;

public class PaymentProcessor {
	void makepayment(double amount) {
		System.out.println("paid :"+amount);
	}
	void makepayment(double amount,String currency) {
		System.out.println("paid :"+currency+amount);	
	}
	void makepayment(double amount,double discount) {
		double finalamount=amount-discount;
		System.out.println("paid :"+finalamount+" with discount  "+discount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor=new PaymentProcessor();
		processor.makepayment(100);
		processor.makepayment(200,"$");
		processor.makepayment(500,50);

	}

}
