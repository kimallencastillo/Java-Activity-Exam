import java.util.Queue;
import java.util.PriorityQueue;
public class QueueCastillo {

	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<Integer>(5); 

		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		
		que.remove();
		que.remove();
		que.remove();
		
		que.add(50);
		que.add(60);
		que.add(70);
		que.add(80);
		
		System.out.println("   Queue");
		  while (!que.isEmpty()) {
			  int n = que.remove();
	            System.out.print(n + " ");
	        }
		 		System.out.println();	  

	}

}
