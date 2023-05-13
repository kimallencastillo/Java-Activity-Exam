import java.io.*;
import java.util.*;

 class Queue{
	 private int maxSize;
		private long[] queArray;
		private int front;
		private int rear;
		private int nItems;
	
	public Queue(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		front = 0 ; 
		rear = -1;
		nItems = 0;
	}
	public void insert(long item) 
	{
		if(isFull() == false)
		{
			if(rear == maxSize -1 )
			rear = -1;
			queArray[++rear] = item;
			nItems++;
		}
	
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	public long remove() {
		long temp = queArray[front++];
		if(front == maxSize)
		front = 0;
		nItems--;
		return temp;
	}
	public long peekFront() {
		return queArray[front];
	}
	public boolean isEmpty() {
		return (maxSize == 0);
	}
	public int size() {
		return nItems;
	}
}
class QueueApp {
	public static void main(String[] args) {
		 System.out.println("Created, by Castillo, Kim Allen C.");
	        System.out.println("==================================");
	     Queue theQueue = new Queue(5); 
	        theQueue.insert(10); 
	        theQueue.insert(20);
	        theQueue.insert(30);
	        theQueue.insert(40);
	        theQueue.remove(); 
	        theQueue.remove(); 
	        theQueue.remove();
	        theQueue.insert(50); 
	        theQueue.insert(60); 
	        theQueue.insert(70);
	        theQueue.insert(80);
	        theQueue.insert(90);
	        while( !theQueue.isEmpty() ) 
	        { 
	            long n = theQueue.remove(); 
	            System.out.print(n);
	            System.out.print(" ");
	        }
	        System.out.println(" ");
	        
	        Queue theQueue1 = new Queue(5);
	        theQueue1.insert(70); 
	        theQueue1.insert(80);
	        theQueue1.insert(10);
	        theQueue1.insert(20); 
	        theQueue1.insert(60);
	       
	        while( !theQueue1.isEmpty() ) 
	        { 
	            long n = theQueue1.remove(); 
	            System.out.print(n);
	            System.out.print(" ");
	        }
	        System.out.println(" ");
	        
	        Queue theQueue2 = new Queue(5);
	        theQueue2.insert(80); 
	        theQueue2.insert(40);
	        theQueue2.insert(50);
	        theQueue2.insert(60); 
	        theQueue2.insert(70);
	        theQueue2.insert(80);
	        while( !theQueue2.isEmpty() ) 
	        { 
	            long n = theQueue2.remove(); 
	            System.out.print(n);
	            System.out.print(" ");
	        }
	        System.out.println(" ");
	        
	        Queue theQueue3 = new Queue(5);
	        theQueue3.insert(40); 
	        theQueue3.insert(50);
	        theQueue3.insert(60);
	        theQueue3.insert(70); 
	        theQueue3.insert(80);
	        theQueue3.insert(40);
	        while( !theQueue3.isEmpty() ) 
	        { 
	            long n = theQueue3.remove(); 
	            System.out.print(n);
	            System.out.print(" ");
	        }
	        System.out.println(" ");
	        
	        Queue theQueue4 = new Queue(5);
	        theQueue4.insert(50); 
	        theQueue4.insert(60);
	        theQueue4.insert(70);
	        theQueue4.insert(80); 
	        theQueue4.insert(40);
	        while( !theQueue4.isEmpty() ) 
	        { 
	            long n = theQueue4.remove(); 
	            System.out.print(n);
	            System.out.print(" ");
	        }
	        System.out.println(" ");
	    } 
}