import java.util.Scanner;

public class CastilloMQ2 {
	//Declaration
	static Scanner in = new Scanner(System.in);
	static int i;
	static String accNo , name , status;
	static float bal , newBal , amnt;
	static char trans , ans;
	static String[] acctName = {"Nadal, Rafael", "Trump, Donald" , "Biden, Joe   ", "Ginobili, Manu"};
	static float[] balance = {1000, 5000, 6000, 4000};
	static String[] accNum = {"A1", "A2", "A3", "A4"};
	

	public static void main(String[] args) {
		do { 
		prtTitle1();
		prtAccts();
		prtTitle2();
		proccess();
		
		System.out.print("Process another transaction (Y/N) ?");
		ans = in.next().charAt(0);
		}while(ans == 'Y'|| ans == 'y');
		
		

	}
	
	static void prtAccts() {
		
		name = "";
		bal = 0;
		System.out.println("\t\tAcct No  " + "Name " + "\t\tBalance");
		for(i = 0 ; i < acctName.length ; i++) {
			
			System.out.println("\t\t"+ accNum[i] + "       " + acctName[i] + "   " + balance[i]);
				
		}
		System.out.println();
		
	}
	
	static void proccess() {
		System.out.print("\t                   Account No.: ");
		accNo = in.next();
		
		switch(accNo) {
		case "A1": 
			name = "Nadal, Rafael";
			bal = 1000;
			break;
		case "A2":
			name = "Trump, Donald";
			bal = 5000;
			break;
		case "A3":
			name = "Biden, Joe";
			bal = 6000;
			break;
		case "A4":
			name = "Ginobili, Manu";
			bal = 4000;
			break;
		}
		System.out.println("\t                          Name: " + name);
		System.out.println("\t                       Balance: " + bal);
		 
		System.out.print("\t         Transaction Type[W/D]: ");
		trans = in.next().charAt(0);
		
		System.out.print("\t                        Amount: ");
		amnt = in.nextFloat();
		
		
		if(trans == 'W' || trans == 'w') {
			newBal = bal - amnt;
		}else if(trans == 'D' || trans == 'd') {
			newBal = bal + amnt;
		}
		
		if(newBal <= 0)
			status = "Closed";
		else
			status ="Active";

		System.out.println("\t                   New Balance: " + newBal);
		System.out.println("\t                        Status: " + status);
		   
		
	}
	static void prtTitle1() {
		System.out.println("\t\t\tBPI Family Bank");
		System.out.println("\t\tTransaction Processing Program");
		System.out.println("\t\t\tList of Accounts");
		System.out.println();
	}
	static void prtTitle2() {
		System.out.println("\t\tTransaction Processing Section");
		System.out.println("\t\t==============================");
		
		
		
	}

}
