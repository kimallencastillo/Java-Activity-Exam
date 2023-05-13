import java.util.Scanner;
public class Castillo_FQ2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int accNum , idx  ,amnt ;
		float getBal;
		char trans , ans;
		do {
		System.out.println("Created By,");
		System.out.println("Castillo, Kim Allen C.");
		Accounts acct = new Accounts();
		Process proc = new Process();
		Print1 prt = new Print1();
		prt.prtTitle1();
		prt.prtTitle2();
		acct.prtAccts();
		prt.prtTitle3();
		prt.printLine();
		
		System.out.print("\t\tAccount No: ");
		accNum = in.nextInt();
		acct.set(accNum);
		acct.prtName();
		acct.prtBal();
		
		System.out.print("\t\tTransaction Type[W/D]: ");
		trans = in.next().charAt(0);
		
		System.out.print("\t\tAmount: ");
		amnt = in.nextInt();
		
		getBal = acct.getBal();
		
		proc.set(trans, getBal, amnt);
		proc.printNewBal();
		proc.printStatus();
		prt.prtMsg();
        ans = in.next().charAt(0);
     } while(ans=='Y' || ans == 'y');
		
		
		
	}

}
