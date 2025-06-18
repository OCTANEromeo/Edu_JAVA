package compileTime;

public class MessageSenderCompileTime {
	void sendMessage(String message) {
		System.out.println("Sending TExt meassge :"+message);
	}
	void sendMessage(String message,String recipient) {
		System.out.println("sending message to "+recipient+": "+message);
	}
	void sendMessage(String message,boolean isUrgent) {
		if(isUrgent) System.out.println("urgent"+message);
		else System.out.println("sending message "+message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSenderCompileTime sender=new MessageSenderCompileTime();
		sender.sendMessage("Hello!");
		sender.sendMessage("Hello!","Bhupesh");
		sender.sendMessage("SErver downnn!",true);
	}

}
