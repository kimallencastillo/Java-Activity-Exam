
/**
 * Write a description of class MEQ2 here.
 *
 * @author R.Buesing
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FQ2Main 
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
        Accounts acct = new Accounts();
        Process proc = new Process();
        do{
            prt.printTitle1();
            prt.printTitle2();
            acct.prtAccts();
            prt.printTitle3();
            prt.prtLine();
            System.out.print("\t        Account No. : "); acctNo = in.nextInt();
            acct.set(acctNo);
            acctName = acct.getName();
            balance = acct.getBal();
            System.out.println("\t                Name : " + acctName);
            System.out.println("\t             Balance : " + balance);
            System.out.print("\tTransaction Type[W/D]: ");
            code = in.next().charAt(0);
            System.out.print("\t               Amount: ");
            amount = in.nextFloat();
            proc.set(code,balance,amount);
            proc.prtBalance();
            proc.prtStatus();
            prt.prtMessage();
            ans = in.next().charAt(0);
        } while(ans=='Y');
    }
}