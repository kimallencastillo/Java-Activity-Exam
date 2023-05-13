/**
 * Write a description of class MEQ2 here.
 *
 * @author Castillo, Kim Allen C
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MEQ2v2
{   static String actNo[] = { "A1", "A2", "A3", "A4" };
    static String actName[] = { "Nadal, Rafael", "Trump Donald ", "Biden Joe    ", "Ginobili Manu" };
    static int bal[] = { 1000, 5000, 6000, 4000 };
    static String actNos, actNames, trans, stat;
    static int bals, newBal, amt;
    
    //using array
    public static int search(String eno){
        for(int ctr = 0; ctr < actNo.length; ctr++){
            if ( actNo[ctr].equals(eno)) 
                return ctr;
        }
        return -1;
    }
    
    public static void prtAccts(){
        System.out.println("Account No.    Account Name     Balance");
        for(int ctr = 0; ctr <= 3; ctr++){
            System.out.println("    "+actNo[ctr]+"         "+actName[ctr]+"     "+bal[ctr]);
        }
    }
    public static void process(){
        Scanner input = new Scanner(System.in);
        int idx;
        prtTitle2();
        System.out.print("          Account No.:  ");
        actNos = input.next();
        
        // locate actNos from array ActNo
        idx = search(actNos);
        if ( idx != -1 ) {    // if found
            actNames = actName[idx];
            bals =  bal[idx];
            System.out.println("                 Name:  " + actNames);
            System.out.println("              Balance:  " + bals);
            System.out.print("Transaction Type[W/D]:  ");
            trans = input.next();
            System.out.print("               Amount:  ");
            amt = input.nextInt();
            if(trans.equals("W")){
                newBal = bals - amt;
            }
            if(trans.equals("D")){
                newBal = bals + amt;
            }
            if(newBal <= 0){
                stat = "Closed";
            }
            else{
                stat = "Active";
            }
            System.out.println("          New Balance:  " + newBal);
            System.out.println("               Status:  " + stat);
        }
    }
    public static void prtTitle1(){
        System.out.println("\n\n           BPI Family Bank");
        System.out.println("    Transaction Processing Program");      
        System.out.println();
        System.out.println("          List of Accounts");
    }
    public static void prtTitle2(){
        System.out.println();
        System.out.println("    Transaction Processing Section");
        System.out.println("   ================================");
    }
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        char ans;
        do{
            prtTitle1();
            prtAccts();
            process();
            System.out.print("\nProcess another transaction (Y/N)? ");
            ans = input.next().charAt(0);
        } while(ans=='Y');
    }
}