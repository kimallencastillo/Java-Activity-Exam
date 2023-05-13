
/**
 * Write a description of class Accounts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accounts
{   int acctNos[] = { 11,12,13,14};
    String actName[] = { "Nadal, Rafael", "Trump Donald ", "Biden Joe    ", "Ginobili Manu" };
    float bal[] = { 1000, 5000, 6000, 4000 };
    int aNo;
    public String getName(){
        for(int ctr = 0; ctr < acctNos.length; ctr++){
            if ( acctNos[ctr] == aNo) 
                return actName[ctr];
        }
        return "";
    }
    public float getBal(){
        for(int ctr = 0; ctr < acctNos.length; ctr++){
            if ( acctNos[ctr] == aNo) 
                return bal[ctr];
        }
        return -1;
    }
    public void prtAccts(){
        System.out.println("   Account No.    Account Name     Balance");
        for(int ctr = 0; ctr < acctNos.length; ctr++){
            System.out.printf("      %d      %-20s %.2f\n",acctNos[ctr],actName[ctr],bal[ctr]);
        }
    }
    public void set( int acct ) {
        aNo = acct;
    }
}
