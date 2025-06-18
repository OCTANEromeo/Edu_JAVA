package set;
import java.util.*;
public class SortedRollNumber {
	public static void main(String[] args) {
		SortedSet<Integer> rollno = new TreeSet<>();
		rollno.add(105);
		rollno.add(101);
		rollno.add(103);
		System.out.println("The sorted set is "+rollno);
	}
}
