import java.util.Scanner;
public class Castillo_Problem1 {

	public static void main(String[] args) {
		//Declaration Section
		Scanner input = new Scanner(System.in);
		int num = 0;
		int n = 0 , high = 0;
		int ctr = 1;
		System.out.println("Find The Highest Value Among N");
		System.out.println("Created By, Castillo Kim Allen C.");
		System.out.println();
		//Input The value Of N
		System.out.print("\tEnter The Value of N: ");
		num = input.nextInt();
		
		System.out.println();
		for(int i = 0 ; i < num ; i++) {
			//Input the Value of Number 
			System.out.print("\t\tEnter Number " + ctr++ + ": ");
			n = input.nextInt();
			//Determine The Highest
			if(n > high) 
				high = n;
			
		}
		System.out.println();
		//Output The Program
		System.out.println("\tThe Largest Number is '" + high + "'");
		

	}

}
