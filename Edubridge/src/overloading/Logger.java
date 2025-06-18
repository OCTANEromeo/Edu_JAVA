package overloading;

public class Logger {
	   void log(String message) {
	        System.out.println(message);
	    }

	    void log(String message, String level) {
	        System.out.println( level + " , " + message);
	    }

	    void log(String message, String level, String user) {
	        System.out.println( level + " , " + user + " : " + message);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger = new Logger();

	     logger.log("Game started");
	     logger.log("Game Over", "Low HP");
	     logger.log("Game Over", "Low HP", "Romeo");
	}

}
