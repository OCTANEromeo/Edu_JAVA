package stack;
import java.util.*;
public class StackExample {
	public static void main(String[] args) {
		Stack<String> history=new Stack<>();
		history.push("page 1");
		history.push("page 2");
		history.push("page 3");
		System.out.println("back"+history.pop());
		System.out.println(history.peek());
		System.out.println("back"+history.pop());
		System.out.println(history.peek());
		System.out.println("back"+history.pop());
		//System.out.println(history.peek());
		System.out.println(history.empty());
	}
}
