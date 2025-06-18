package runTime;
public class Messenger {
	void send() {
		System.out.println("sending a generic message");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messenger mess;
		mess=new WhatsappMessenger();
		mess.send();
		mess=new EmailMessenger();
		mess.send();
	}
}
class WhatsappMessenger extends Messenger{
	void send() {
		System.out.println("sending via whatsapp");
	}
}
class EmailMessenger extends Messenger{
	void send() {
		System.out.println("sending via Email");
	}
}

