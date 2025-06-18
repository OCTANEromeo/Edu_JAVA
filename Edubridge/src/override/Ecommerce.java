package override;

class Order {
    void processOrder() {
        System.out.println("Processing general order...");
    }
}

class OnlineOrder extends Order {
    void ProcessOrder() {
        System.out.println("Processing online order with digital invoice...");
    }
}

class InStoreOrder extends Order {
	@Override
    void processOrder() {
        System.out.println("Processing in-store order with printed receipt...");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Order o1 = new OnlineOrder();
        Order o2 = new InStoreOrder();

        o1.processOrder();
        o2.processOrder(); 
    }
}