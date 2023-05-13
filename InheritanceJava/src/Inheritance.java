
public class Inheritance {
	//The whole idea of Inheritance is to create classes that 'inherit' from other classes or they 'extends' to another class  
	/*	
	 * 		   Animal
	 * 			/   \
	 * 		 Dog	Cat 
	 * 
	 *  *The best way to explain it is through Animal Class you can have dog & cat Class
	 *  this 2 will will become Animal so we can define common behavior so that the dog
	 *  and cat class will automatically get the behavior.
	 *  
	 *  Pros:
	 *  - For Code Reusability
	 *  - For Method Overriding 
	 *   
	 */
	public static void main(String[] args) {
		/*			Types of Inheritance
		 * 								Class A					  Class A --> Parent Class
		 * 								   ^						/  \	
		 * 								   | 					   /	\
		 *		Class A					Class B					  /		 \
		 *		   ^					   ^					 /	      \
		 *		   |					   |					/    	   \
		 *		Class B					Class C				Class B		  Class C --> Child Class
		 *   Single Inheritance   MultiLevel Inheritance   Hierarchial Inheritance  	 
		 */
	}
}


/* If you compare cat and dog you will find one things in common both are Animals.
 * If both are Animals we can have both properties in common like 'color' and in method we have both 'eat()'
 * these 2 properties will be repeated in both Classes in that case we can simply make the Class of Animal
 * and put those 2 repeated properties and method in Animal Class 
 */


//This inheritance of the property is actually called the concept of 'Inheritance in Java'.
//The Animal Class is known as Parent class . Super Class , Base Class
//The Cat & Dog Class is known as Sub class or Child Class
class Animal {
	String color;
	
	void eat() {}
}
//The 'extends' keyword simply inherit the properties of Animal Class inside the Dog Class
class Dog extends Animal{
	//String color;
	String breed;
	
	void bark() {}
	//void eat() {}
}

class Cat extends Animal{
	//String color;
	int age;
	
	void meow() {}
	//void eat() {}
	
	
}

