package arrayDequeue;
import java.util.*;
public class ArrayDequeueExample {
	public static void main(String[] args) {
		Deque<String> deq=new ArrayDeque<>();
		deq.offerFirst("Start");
		deq.offerLast("last");
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
	}
}
