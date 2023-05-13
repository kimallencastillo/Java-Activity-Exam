import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class Castillo_Insertion {
	class Link{
		//int first;
		Link next;
		Link first;
		
	}
	public void insertFirst(int id,int dd) {
		Link newLink = new Link();
		//newLink.next = first;
	}
	
	
	
	
	public static void main(String[] args) {
	
		Stack <String> basket = new Stack<String>();
		System.out.println("Adding 1 nodes to the list Basket:");
		basket.push("Apple");
		System.out.println(basket);

		System.out.println("Adding 1 nodes to the list Basket:");
		basket.push("Mango");
		System.out.println(basket);
		

		System.out.println("Adding 1 nodes to the 3 list Basket:");
		basket.push("Grapes");
		System.out.println(basket);basket.push("Grapes");
		

		System.out.println("Adding 1 nodes to the list Basket:");
		basket.push("Orange");
		System.out.println(basket);
		System.out.println("The basket has a list of: " + basket);
		
		System.out.println("remove 1 nodes to the list Basket:");
		basket.pop();
		System.out.println(basket);
		System.out.println("remove 1 nodes to the list Basket:");
		basket.pop();
		System.out.println(basket);
		System.out.println("remove 1 nodes to the list Basket:");
		basket.pop();
		System.out.println(basket);
		System.out.println("remove 1 nodes to the list Basket:");
		basket.pop();
		System.out.println(basket);
		System.out.println("remove 1 nodes to the list Basket:");
		basket.pop();
		if(basket.isEmpty())
			System.out.println("The Basket is empty");
		System.out.println("Castillo, Kim Allen C.");
		
		
		

	}

}
