import java.util.Scanner;
/*Delovieres contribution: Str1 and debugging StringMain and other classes */
/*Castillo contribution: Str2 and contribute some idea in StringMain*/
public class StringMain{
   public static void main(String[] args)
  {   
   char ans;
   do{
    String n1 = " ";
    String ver, inverse, diag, normal, space, dash;
    Scanner scanf = new Scanner(System.in);
    System.out.println("String Manipulation");
    System.out.println("Using OOP Approach");
    System.out.println("Developed by Castillo, Kim Allen C. and  Delovieres, Adrian Benedict.");
    System.out.print("Enter letters: ");
    n1 = scanf.nextLine();
    Str1 cp = new Str1();
    cp.set(n1); 
    normal = cp.prt1();
    System.out.println();
    space = cp.prt2();
    System.out.println();
    dash = cp.prt3();
    System.out.println();
    ver = cp.prt4();
    System.out.println();
    inverse = cp.prt5();
    System.out.println();
    diag = cp.prt6();
    
    System.out.print("\nDo you want to Try Again?[Y/N] ");
    ans = scanf.next().charAt(0);;
   }while(ans == 'Y' || ans == 'y');
  }
}
