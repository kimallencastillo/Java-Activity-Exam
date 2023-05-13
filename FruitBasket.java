import java.util.Scanner;
import java.util.Stack;
public class FruitBasket {

	public static void main(String[] args) {
		//declaration
		int catchFruit;
		String choice = " ", a, o, m, g;
		Scanner in = new Scanner(System.in);
		Stack<String> basket = new Stack <String>();
		basket.push("Apple");
		basket.push("Orange");
		basket.push("Mango");
		basket.push("Guava");
		
		System.out.println("Catch and Eat any of these fruits: " + basket);
		
		System.out.print("How many ? : ");
		catchFruit = in.nextInt();
		
		System.out.println("Press A, O, M, G");
		for( int i = 0 ; i < catchFruit ; i++) {
			int ctr = 1;
			System.out.print("Fruits " + ctr++ + " of " + catchFruit + ": "  );
			choice = in.next().toUpperCase();
			
			if(choice.equalsIgnoreCase("A")) {
				basket.push("Apple");
				System.out.println(basket);
				}else if(choice.equalsIgnoreCase("O")) {
					basket.push("Orange");
					System.out.println(basket);
					}else if(choice.equalsIgnoreCase("M")) {
						basket.push("Mango");
						System.out.println(basket);
						}else if(choice.equalsIgnoreCase("G")) {
							basket.push("Guava");
							System.out.println(basket);
							}
		}
	}

}
