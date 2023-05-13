import java.util.Queue;
import java.util.*;

public class QueueJava {

	public static void main(String[] args) {
		Queue q= new LinkedList();
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		
		while(!q.isEmpty()) {
			long n = (long) q.remove();
			System.out.print(n);
			System.out.print(" ");
			
		}
	}

}
