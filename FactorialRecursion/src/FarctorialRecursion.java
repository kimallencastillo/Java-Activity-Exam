import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class FarctorialRecursion {

	public static int n;
	public static int factorial(int n) {
		if(n == 1)
			return 1;
		else
			return (n * factorial(n-1));
	}
	public static void rec(int n) {
		int i = 1;
		char menu;
		int[] len = new int[n];
		if(n == 1)
			System.out.println("1");
		
		else
		while(i < len.length){
			n *= i;
			System.out.println("The Product " + i + " is "+ n);	
			i++;
			
		};
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = input.nextInt();
		
		rec(n);
		
		int fac = factorial(n);
		System.out.println("The Factorial of " + n + " is " + fac);
	}
	

}