package priorityQueue;
import java.util.*;
public class PriorityQueueExample {
	public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	pq.offer(3);
	pq.offer(2);
	System.out.println(pq.poll());
	}
}
