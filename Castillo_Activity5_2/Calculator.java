import java.util.Scanner;
public class Calculator {

		public static void main(String[] args) { 
			Scanner in = new Scanner(System.in);
			float n1 ;
			float n2 ;	
			// Create an instance of Calc1 class
			Calc1 c1 = new Calc1();
			Calc2 c2 = new Calc2();
			Calc3 c3 = new Calc3();
			float sum, diff, prod, quo , remainder , max , min;
			char ans;
			
			
			do {
				System.out.println();
				System.out.println("\t       CALCULATOR    ");
				System.out.println("\t-----------------------");
			System.out.print("\tEnter the First Number: ");
			n1 = in.nextFloat();
			System.out.print("\tEnter the First Number: ");
			n2 = in.nextFloat();
			
			c1.set(n1,n2);
			sum = c1.calcSum();
			diff = c1.calcDiff();
			
			c2.set(n1,n2);
			prod = c2.calcProd();
			quo = c2.calcQuo();
			
			c3.set(n1, n2);
			remainder = c3.calcRemainder();
			max = c3.calcMax();
			min = c3.calcMin();
			
			// Display results
			System.out.println("\t-------Results-------------");
			System.out.println("\tSum is        : " + sum );
			System.out.println("\tProduct is    : " + prod );
			System.out.println("\tDifference is : " + diff );
			System.out.println("\tQuotient is   : " + quo );
			System.out.println("\tRemainder is  : " + remainder);
			System.out.println("\tThe Max is    : " + max);
			System.out.println("\tThe Min is    : " + min);
			System.out.println();
			System.out.println("Created by, Castillo, Kim Allen C.");
			
			System.out.println();
			System.out.print("Would you like to try again? [Y/N] : ");
			ans = in.next().charAt(0);
			
			}while(ans == 'Y' || ans == 'y');
		}
	
}