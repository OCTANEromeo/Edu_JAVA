package queue;
import java.util.*;
public class PrintQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> printjobs=new LinkedList<>();
		printjobs.offer("Java");
		printjobs.offer("PYTHON");
		printjobs.offer("C++");
		System.out.println("The jobs");
		while(!(printjobs.isEmpty())) {
			System.out.println("The jobs are:"+printjobs.poll());
		}
		

	}

}
