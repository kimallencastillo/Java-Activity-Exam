import java.io.*;
import java.util.*;

class PriorityQCastillo {
	private static int maxSize;
	private double[] queArray;
	private int nItems;
	
	//Priority declaration
	PriorityQCastillo(int s) {
		maxSize = s;
		queArray = new double[maxSize];
		nItems = 0 ;
	}
	
	//Insert 
	public void insert(double item) {
		int j;
		
		if(nItems == 0 ) 
			queArray[nItems++] = item;
		else 
			{
				for(j = nItems - 1 ; j >= 0 ; j--) 
				{
					if(item > queArray[j])
					queArray[j+1] = queArray[j];
					else
						break;
				}
			queArray[j+1] = item;
			nItems++;
		}
	}
	//remove
	public double remove() {
		return queArray[--nItems];
	}
	
	//peek
	public double peekMin() {
		return queArray[nItems - 1];
	}
	
	//isEmpty
	public boolean isEmpty() {
		return(nItems == 0 );
	}
	
	//isFull
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	
	static class PriorityQApp {
	public static void main(String[] args) {
		PriorityQCastillo thePQ = new PriorityQCastillo(5);
		thePQ.insert(546);
		thePQ.insert(687);
		thePQ.insert(36);
		thePQ.insert(98);
		thePQ.insert(957);
		System.out.println("   PriorityQueue");
		while( !thePQ.isEmpty()) {
			double item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
		
		}
	}
}
