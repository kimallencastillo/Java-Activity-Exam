
/**
 * Write a description of class Process here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Process
{       char tranType;
        float balance,tranAmt,newBal;
        public void set(char type, float bal, float amt){
            tranType = type;
            balance = bal;
            tranAmt = amt;
        }
        public void prtBalance(){
            newBal=0;
            if (tranType == 'W') 
                newBal = balance - tranAmt;
            else
                newBal = balance + tranAmt;
            System.out.println("\t         New Balance : " + newBal);
        }
        public void prtStatus(){
            String stat="";
            if (newBal > 0 ) 
                stat = "Active";
            else
                stat = "Closed";
            System.out.println("\t              Status : " + stat);
        }
         public void prtBalanceAndStatus(char type, float bal, float amt){
            String stat="";
            float newBal=0;
            if (type == 'W') 
                newBal = bal - amt;
            else
                newBal = bal + amt;
            if (newBal > 0 ) 
                stat = "Active";
            else
                stat = "Closed";
            System.out.println("\t         New Balance : " + newBal);    
            System.out.println("\t              Status : " + stat);
        }
}
