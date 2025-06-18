package hashTable;
import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
	Hashtable<String,String> login=new Hashtable<>();
	login.put("Admin","1234");
	login.put("user","abcd");
	System.out.println("admin password "+login.get("Admin"));
	}
}
