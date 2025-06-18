package edu_package;

class Animal{
	void sound() {
		System.out.println("Generic animal sound");
	}
	
}

class Dog extends Animal{
	void sound() {
		super.sound();
		System.out.println("Bark");
	}
}
// next question 
class Bank{
	Bank(String bankname){
		System.out.println("Bank name"+ bankname);
	}
}
class Branch extends Bank{
	Branch(String bankname,String branchname){
		super(bankname);
		System.out.println("Bank name :"+ bankname +" Branch name:"+branchname);
	}
}
public class Main_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Dog tom=new Dog();
		tom.sound();
	}
}
