import java.util.LinkedList;
public class SingleLinkedListCastillo {
	  class Node{    
	        int first;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.first = data;    
	            this.next = null;    
	        }    
	    }    
	     
 
	    static Node top;    
	    static Node tail;    
	         
	    public void addNode(int data) {    
	        Node newLink = new Node(data);    
	            
	        if(top == null) {      
	            top = newLink;    
	            tail = newLink;    
	        }    
	        else {    
	            tail.next = newLink;    
	           tail = newLink;    
	        }    
	    }    
	            
	    public void display() {    
	        
	        Node current = top;    
	            
	        if(top == null) {    
	            System.out.println("The List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	         
	            System.out.print(current.first + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	        
	    public static void main(String[] args) {    
	            
	    	LinkedList<String> pc = new LinkedList<String>();    
	       pc.add("Your name");
	       pc.add("person in your right");
	       pc.add("person in your");
	       
	       System.out.println(pc.toString());
	 
	  }    
}    


