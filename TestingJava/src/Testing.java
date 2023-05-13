import java.util.Scanner;
import java.util.Stack;
public class Testing {

	public static void main(String[] args) {
		String cl, brd;
		Cats c = new Cats();
		cl = c.breed = "yellow";
		brd = c.color = "Pink";
		System.out.println("The color of the Cat is " + brd);
		System.out.println("The Breed of the Cat is " + cl);
		
		c.eat();
		
		Animal c1 = new Cats();
		c1.eat();
		String nm;
		nm = Cats.name = "Jane";
		
		System.out.println("My Cat Name is " + nm);	
	}

}
class Animal{
	
	String color;
	
	public void eat() {
		System.out.println("Animal Eat");
	}
}
class Cats extends Animal{
	String breed;
	static String name;
	public void eat() {
		System.out.println("Catto Eat");
		
	}
}