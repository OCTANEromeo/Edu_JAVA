package interface1;

interface Animalll {
	void animalruns();
	void sleep();
}
class Dogg {
	void bark() {
		System.out.println("i have to bark");
	}
}
class Catt implements Animalll{
	@Override
	public void animalruns(){
		System.out.println("The cat runs...");
	}
	@Override
	 public void sleep() {
		System.out.println("The cat sleeps");
	}
	class Dawg extends Dogg{
	    void bark() {
	    	System.out.println("I Dwag bark");
	    }
	} 
	public static void main(String[] args) {
		Catt mycat=new Catt();
		Dogg da=new Dogg();
		Catt.Dawg dag=mycat.new Dawg();
		mycat.sleep();
		mycat.animalruns();
		da.bark();
		dag.bark();
	}
}
