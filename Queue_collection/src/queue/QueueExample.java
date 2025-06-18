package queue;
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
	public static void main(String[] args) {
		Queue<String> que=new LinkedList<>();
		que.offer("apple");
		que.offer("mango");
		que.offer("banana");
		System.out.println("Frone of queue"+que.peek());
		while(!(que.isEmpty())) {
			System.out.println("Removed "+que.poll());
		}
		System.out.println("empty"+que.isEmpty());
		

	}
}
