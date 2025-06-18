package linkedList;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> task=new LinkedList<>();
		task.add("Task 1");
		task.add("Task 2");
		task.add("Task 3");
		task.addFirst(" Urgent Task ");
		System.out.println("First TAsk"+ task.getFirst());
		System.out.println(task.getLast());
	}
}
