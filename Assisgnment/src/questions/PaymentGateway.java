package questions;
import java.util.*;
public interface PaymentGateway {

 void processPayment(double amount);
 void generateReceipt();
}


class UPIPayment implements PaymentGateway {
 public void processPayment(double amount) {
     System.out.println("UPI payment of " + amount);
 }

 public void generateReceipt() {
     System.out.println("Receipt: UPI Payment Successful.");
 }
}

class CreditCardPayment implements PaymentGateway {
 public void processPayment(double amount) {
     System.out.println("Credit Card payment of " + amount);
 }
 public void generateReceipt() {
     System.out.println("Receipt: Credit Card Payment Successful.");
 }
}

class PaymentApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter method: ");
     String method = sc.nextLine();

     System.out.print("Enter amount: ");
     double amount = sc.nextDouble();

     PaymentGateway payment;

     if (method.equals("upi")) {
         payment = new UPIPayment();
     } else if (method.equals("card")) {
         payment = new CreditCardPayment();
     } else {
         System.out.println("Invalid payment method.");
         return;
     }
     payment.processPayment(amount);
     payment.generateReceipt();
     sc.close();
 }
}
