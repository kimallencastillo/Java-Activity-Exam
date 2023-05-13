/*
 * Factorial & Triangle Calculator
 * @author( Castillo, kim allen C.) 
 */
import java.util.Scanner;
public class CastilloFactorialAndTriangle {
	final static Scanner input = new Scanner(System.in);
	public static int fac , trai , n;
	static int[] c;

	public static void main(String[] args) {
		int num;
		char menu;
		int compile;
		System.out.println("Factorial & Triangle Calculator");
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		

		System.out.print("Enter [A] if Factorial and [B] for Triangle: ");
		menu = input.next().charAt(0);
		
		if(menu == 'a' || menu == 'A') {
			System.out.println("Factorial");
			factorial(num);
			compile = returnFac(num);
			System.out.println("Factorial = " + compile);
		}
		else if(menu == 'b' || menu == 'B') {
			System.out.println("Triangle");
			triangle(num);
			compile = triangle_1(num);
			System.out.println("Triangle  = " + compile);
			
		}

	}
	public static void factorial(int num) {
		fac = 0;
		int[] n = new int[num];
		
		if(num == 0 )
			System.out.println("1");
		
		for(int i = 0 ; i < n.length; i++) {
			System.out.print("Enter n = ");
			fac = input.nextInt();	
		}
		for(int i = 1; i <= n.length ; i++) {
			fac *=  i;
			num = fac;
			System.out.println("Returning = " + num);
			
		}
	}
		public static int returnFac(int num) {
			
			if(num == 1)
				return 1;
			else
				return (num * returnFac(num-1));
		}
	public static void triangle(int num) {
		int sum;
		c = new int[num];
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print("Enter n = ");
			trai = input.nextInt();
		}
	}
	public static int triangle_1(int num) {
		if(num == 1) {
			System.out.println("Returning = 1");
			return 1;
		}
		else
		{
			trai = num + triangle_1(num - 1) ;
			num = trai;
			System.out.println("Returning = " + num);
			return  num;
		}
	}
}


