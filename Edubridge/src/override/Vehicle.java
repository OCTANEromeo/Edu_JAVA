package override;

 class Veh {
	   void move() {
	        System.out.println("The vehicle moves");
	    }
	}
	class Car extends Veh {
	    void move() {
	        System.out.println("The car drives on roads.");
	    }
	}

	class Boat extends Veh {
	    void move() {
	        System.out.println("The boat sails on water.");
	    }
	}
public class Vehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car v1 = new Car();
        Boat v2 = new Boat();
        v1.move(); 
        v2.move(); 

	}
}

