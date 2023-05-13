import java.util.Scanner;
 /* Delovieres contribution: Str1 and debugging StringMain and other classes 
  * Castillo contribution: Str2 and contribute some ideas in StringMain    */ 
 
public class StringMain
{ 

    public static void main(String[] args)
{
    char ans = ' ';
    System.out.println("String Manipulation ");
    System.out.println("Using OOP Approach");
    System.out.println("Developed by Castillo and Delovieres\n");
    do {
    String n1 = " ";
    String ver, inverse, diag, normal, space, dash;
    Scanner scanf = new Scanner(System.in);
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
    System.out.println();
    System.out.println("\nTry again?");
    ans = scanf.next().charAt(0);
} while(ans == 'y'|| ans == 'Y');
          
    
    
}
}
