import java.util.Scanner;

public class PreTestJava {
	final static Scanner in = new Scanner(System.in);
	public static int menu , empNo;
	public static float  rate , regHr , overHr , regPay , overPay , gross , tax, netPay	;
	public static float d1, d2, d3, d4, d5, d6, d7;
	public static String empName;
	public static int[] empNums = {1111, 1112, 1113, 1114};
	public static char ans;
	public static String[] empNames = {"Lebron James", "Micheal Jordan", "Luka Doncic", "James Harden"};

	public static void main(String[] args) {
		
			do {
			System.out.println("\t\tList of Option");
			System.out.println();
			System.out.println("\t[1] - Dispay Employees");
			System.out.println("\t[2] - Get Employees");
			System.out.println("\t[3] - Get Employees Hours");
			System.out.println("\t[4] - Display Payslip");
			System.out.println("\t[0] - Quit");
				
			System.out.println();
			System.out.print("Choose an Option: ");
			//prtMenu();
			menu = in.nextInt();		
		switch(menu) {
	
		case 1:
			System.out.println("prtList()");
			break;
		case 2:
			System.out.println("getHrs()");
			//getEmp();
			break;
		case 3:
			System.out.println("getHrs()");
			//getHrs();
			break;
		case 4:
			System.out.println("prtPay()");
			//prtPay();
			break;
			}
		
		System.out.println("Type 'R' to return..." );
		ans = in.next().charAt(0);
		}while(ans == 'R' || ans == 'r');

	}
}