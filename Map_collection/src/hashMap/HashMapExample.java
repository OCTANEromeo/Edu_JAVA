package hashMap;
import java.util.HashMap;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String,Integer> marks=new HashMap<>();
		marks.put("Alice",10);
		marks.put("ramu",40);
		marks.put("rohan",100);
		System.out.println("Alice marks:"+marks.get("Alice"));
		System.out.println("ramu marks:"+marks.get("ramu"));
		System.out.println("rohan marks:"+marks.get("rohan"));
		System.out.println(marks.values());
	}
}
