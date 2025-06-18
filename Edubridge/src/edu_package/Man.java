package edu_package;

class Ani {

void eat() {

System.out.println("The animal eats food");
}
   
}

class Dark extends Ani{

void bark(){

   System.out.println("The dog barks");
}
}
public class Man{
   public static void main(String[] args) {

   Dark d = new Dark();
   d.eat();
   d.bark();
   }
   
}