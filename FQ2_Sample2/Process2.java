
/**
 * Write a description of class Process2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Process2
{         public void prtBalanceAndStatus(char type, float bal, float amt){
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
