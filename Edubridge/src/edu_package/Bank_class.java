package edu_package;
import java.util.Scanner;
public class Bank_class {
	double balance;
	int accNo;
	String Holdername;
	Bank_class(int accNo,String Holdername,double balance){
		balance=balance;
		accNo=accNo;
		Holdername=Holdername;
	}
	void info() {
		System.out.println("Holdername- "+Holdername);
		System.out.println("accNo- "+accNo);
		System.out.println("balance- "+balance);
	}
	void deposit(int addmoney) {
		balance+=addmoney;
	}
	public static void main(String args[]) {
		Bank_class acc1=new Bank_class(101, "Bhupesh", 1000);
		acc1.info();
		
		
	}
}
