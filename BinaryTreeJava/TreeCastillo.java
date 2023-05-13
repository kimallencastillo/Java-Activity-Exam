import org.w3c.dom.Node;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeCastillo { 
  public Node root;
 
  
  class Node{
	  int iData, key;
	  float fData;
	  double dData;
	  Node leftChild;
	  Node rightChild;
	
	  public void displayNode() {
		  
	  }
  }
  public Node find(int key) {
	  
	  Node current = root;
	  while(current.iData != key) {
		  if(key < current.iData)
			  current = current.leftChild;
		  else
			  current = current.rightChild;
		  if(current == null)
			  return null;
	  }
	  return current;
  }
  
  public void insert(int id, double dd) {
	  Node  newNode = new Node();
	  newNode.iData = id;
	  newNode.dData = dd;
	  if(root == null)
		  root = newNode;
	  else {
		  Node current = root;
		  Node parent;
		  
		  while(true) {
			  parent = current;
			  if(id < current.iData) {
				  current = current.leftChild;
			  		if(current == null) {
			  			parent.leftChild = newNode;
			  			return;
				  }
			  }
			  else {
				  current = current.rightChild;
				  if(current == null) {
					  parent.rightChild = newNode;
					  return;
				  }
			  }
		  }
	  }
	  
  }

  
  public void delete(int id) {
	  
  }

  static class TreeApp{
	  static Scanner in = new Scanner(System.in);
	  public static void main(String[] args) {
	TreeCastillo newTree = new  TreeCastillo();
	  //insert 3 Nodes
	  newTree.insert(50, 1.5);
	  newTree.insert(25, 1.7);
	  newTree.insert(75, 1.9);
	  System.out.println("Created By,");
	  System.out.println("Castillo, Kim Allen C.\n");;
	  System.out.println("       Traversal Tree");
	  System.out.println("The Inserted Value is: 50 25 75" );
	  System.out.println("       Finding 25 key");
	  Node found = newTree.find(25);
	  //find //node with key 25
	  if(found != null)
		  System.out.println("Found the node with key 25"  );
	  else
		  System.out.println("Could not Find node with key 25");
		  
	 }
  }
}
