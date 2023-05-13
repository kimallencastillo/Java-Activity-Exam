import java.util.Scanner;
import java.util.*;
public class CastilloAct5_1 {
	static Scanner in = new Scanner(System.in);
	static String[] cNO = {"C1" , "C2" , "C3" , "C4" , "C5"};
	static String[] cosName = {"7-11         ", "I-Mart       " , "Mercury Drugs" , "SM Mart      " , "Jollibee     "};
	static int[] curBals = {10000,20000,15000,18000,12000};
	static char ans ;
	static int i  , idx , bals , inNum , inAmnt , amntPaid ,inBal , cBal , oBal , inAm , menu;
	static String cNum , inDate , payType ,status ,  over;
	static int[] vcNo = {1111, 1112, 1113, 1114, 1115};
	static int[] amnt = {5000, 5500, 4000, 4500, 6000};
	static String[] date = {"6/15/2019", "6/18/2020" , "7/5/2020", "7/8/2020" , "8/12/2020"};
	
	public static void printCust() {
		System.out.println("\t  List of Customers");
		System.out.println("   CNO.    Customer Name.     Current Balance");
		for(i = 0 ; i < vcNo.length ; i++) {
			System.out.println("   "+cNO[i]+"      "+cosName[i]+"          "+curBals[i]);
		}
	}
	public static void printInv() {
		System.out.println("\t  List of Invoices");
		System.out.println("Invoice No.    Amount.     Date");
		for(i = 0 ; i < vcNo.length ; i++) {
			System.out.println("    "+vcNo[i]+"       "+amnt[i]+"     "+date[i]);
		}		
	}
	//search
	public static int search(String num) {
		for(int i = 0 ; i < cNO.length; i++) {
			if(cNO[i].equalsIgnoreCase(num))
				return i;
		}
		return -1;
	}
	public static int search1(int num) {
		for(int i = 0 ; i < vcNo.length; i++) {
			if(vcNo[i] == num)
				return i;
		}
		return -1;
	}	
	static void printOptionMenu(){
		System.out.println("\t\tList of Option");
		System.out.println();
		System.out.println("\t[1] - Display List of Customers");
		System.out.println("\t[2] - Display List of Invoice");
		System.out.println("\t[3] - Get Accounts Recievable ");
		System.out.println("\t[4] - Get Invoice");
		System.out.println("\t[5] - Display Overall");
		System.out.println("\t[0] - Quit");
		System.out.println();
	}

	public static void main(String[] args) {
		CastilloAct5_1 pc = new CastilloAct5_1();
		
		do {
			pc.printOptionMenu();
			System.out.println();
			System.out.print("Choose an Option: ");
			menu = in.nextInt();		
		switch(menu) {
		case 0:
			System.exit(0);
			break;
		case 1:
			pc.printCust();
			break;
		case 2:
			pc.printInv();
			break;
		case 3:
		pc.printTitle1();
		System.out.print("Customer No.     :: ");
		cNum = in.next();
		pc.printCustomer();
			break;
		case 4:
			pc.printTitle2();
			pc.processPMT();	
			break;
		case 5:
			printOverAll();
			break;
			}
		
		System.out.println("Type 'R' to return..." );
		ans = in.next().charAt(0);
		}while(ans == 'R' || ans == 'r');

		System.out.println("Castillo, Kim Allen C.");
	}	
		
	public static void printCustomer() {
		idx = search(cNum);
		if(idx != -1) {
			cNum = cosName[idx];
			bals = curBals[idx];
			System.out.println("Customer         :: " + cNum);
			System.out.println("Current Balance  :: " + bals);
		}
		
	}
	
	public static void printTitle1() {
		System.out.println("Essentials Sweet and Snacks Incorporated");
		System.out.println("\tAccounts Recievable System");
	}
	public static void printTitle2() {
		System.out.println("Custommer Payment Transaction");
		System.out.println("--------------------------------");
		
	}
	public static void processPMT() {
		System.out.print("Invoice            : ");
		inNum = in.nextInt();
		idx = search1(inNum);
		cBal = curBals[idx];
		if(inNum != -1) {
			inDate = date[idx];
			inAmnt = amnt[idx];
			System.out.println("Invoice Date       : " + inDate);
			System.out.println("Invoice Amount     : " + inAmnt);
			System.out.print("Amount Paid        : ");
			amntPaid = in.nextInt();
			System.out.print("Payment Type[C/K]  : ");
			payType = in.next();
			
			if(payType.equalsIgnoreCase("C")) {
				inBal = inAmnt - amntPaid;
				oBal = cBal - amntPaid;
			}
			if(inBal == 0 || inBal < 0 ) 
				status = "Fully Paid";	
			else
				status = "Partially Paid";
			
			if(payType.equalsIgnoreCase("K")) {
					status = "Pending";
			String inBal1 = Integer.toString(inBal);
			inBal1 = "Pending";
			
			System.out.println("Remaining Invoice Balance   : " + inBal1);
			}
			else {
			System.out.println("Remaining Invoice Balance   : " + inBal);
			}
			System.out.println("status             : " + status);
			
		}
		
	}
	
	public static void printOverAll() {
		System.out.println("Custommer Overall Credits Status");
		System.out.println("--------------------------------");
		if(payType.equalsIgnoreCase("K")) {
			String oBal1 = Integer.toString(oBal);
			oBal1 = "Pending";
		System.out.println("Updated Overall Balance: "  + oBal1);
		}
		else { 
			System.out.println("Updated Overall Balance: "  + oBal);
		}
		
	}
	
}
		

	
	


