import java.util.Scanner;
public class FEMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opt;
		char ans;
		Print1 prt = new Print1();
		Payroll pay =  new Payroll();
		do {
		prt.prtTitle1();
		prt.prtTitle2();
		prt.prtMenu();
		
		prt.prtMessage();
		opt = in.nextInt();
		
		switch(opt) {
		case 1:
			pay.prtEmployess();
			break;
		case 2: 
			pay.prtHours();
			break;
		case 3: 
			pay.prtTotalRegHts();
			break;
		case 4: 
			pay.prtTotalOTHts();
			break;
		case 5: 
			pay.prtPayroll();
			break;
		case 6: 
			prt.prtProgran();
			prt.prtDate();
			prt.prtName();
			break;
		case 7: 
			System.exit(0);
			break;
		}
		prt.prtReturn();
		ans = in.next().charAt(0);
		}while(ans == 'r' || ans == 'R');
		
		
	}

}
