import java.util.Scanner;
public class MidCastillo1 {
	static int high , low , pow , exp , n1 , n2;
	static long sum = 1;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter number 1 value: ");
		n1 = in.nextInt();
		
		System.out.print("Enter number 2 value: ");
		n2 = in.nextInt();

		for( int i = 0 ; i < 1; i++) {
			if(n1 > high) { 
				high = n1;
			}else if(n2 > high ) { 
				high = n2;
			}
			
		if(i == 0) {
			low = n1;
			low = n2;
		}
		else {
		
		if(n1 < low) {
			low = n1;
		}else if(n2 < low) { 
			low = n2;
		}
		}
		System.out.println(high + " is the higher value.");
		}
		exp = low;
		pow = high;
		for(int i = 0 ; i < exp ; i++) {
			sum *= pow;
		}

		System.out.println("The power of " + low + " for " + high +" is " + sum + ".");
		System.out.println("Castillo, Kim Allen C");
	}

}
