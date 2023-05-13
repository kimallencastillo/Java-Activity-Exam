
/**
 * Write a description of class FQ2Main2 here.
 * This alternative solution for Final Quiz #2 implements the following changes to the 
 * original solution:
 * a. It eliminates the use of set() method for both Process2 and Accounts2.
 * b. It also eliminates the need for class variables in classes Process2 and Accounts2 
 *    since the values needed by each method are passed to them directly
 * c. Finally, it connects the two classes Process2 and Accounts2 which reduces the
 *    number of objects to be used inside FQ2Main2
 * 
 * @author RRB
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FQ2Main2
{ 
	public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        char ans;
        int acctNo;
        String acctName;
        float balance;
        float newBal;
        float amount;
        char code;
        Print1 prt = new Print1();
        Accounts2 acct = new Accounts2();
        do{
            prt.printTitle1();
            prt.printTitle2();
            acct.prtAccts();
            prt.printTitle3();
            prt.prtLine();
            
            System.out.print("\t        Account No. : "); 
            acctNo = in.nextInt();
            
            acctName = acct.getName(acctNo);
            balance = acct.getBal(acctNo);
            
            System.out.println("\t                Name : " + acctName);
            System.out.println("\t             Balance : " + balance);
            
            System.out.print("\tTransaction Type[W/D]: ");
            code = in.next().charAt(0);
            
            System.out.print("\t               Amount: ");
            amount = in.nextFloat();
            acct.prtBalanceAndStatus(code,balance,amount);
            prt.prtMessage();
            ans = in.next().charAt(0);
        } while(ans=='Y');
    }
}