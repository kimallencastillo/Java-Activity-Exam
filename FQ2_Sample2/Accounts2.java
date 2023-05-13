

/**
 * Write a description of class Accounts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accounts2 extends Process2
{   int acctNos[] = { 11,12,13,14};
    String actName[] = { "Nadal, Rafael", "Trump Donald ", "Biden Joe    ", "Ginobili Manu" };
    float bal[] = { 1000, 5000, 6000, 4000 };
    public String getName(int aNo){
        for(int ctr = 0; ctr < acctNos.length; ctr++){
            if ( acctNos[ctr] == aNo) 
                return actName[ctr];
        }
        return "";
    }
    public float getBal(int aNo){
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
}
