package edu_package;
import java.util.Scanner;
public class Student_class {
	int rollno,marks;
	String name;
	
	Student_class(String name,int rollno,int marks){
		 this.name=name;
		 this.rollno=rollno;
		 this.marks=marks;
	}
	void info() {
		System.out.println("Student name:"+name);
		System.out.println("Student rollno:"+rollno);
		System.out.println("Student marks:"+marks);
	}
	void status() {
		if(marks>35) System.out.println("Pass");
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String n=sc.nextLine();
		System.out.println("Enter rollno");
		int roll=sc.nextInt();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		Student_class student1=new Student_class(n, roll, marks);
		student1.info();
		student1.status();
		sc.close();
	}

}
