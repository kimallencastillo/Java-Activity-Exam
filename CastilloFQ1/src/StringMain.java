/**
 * Write a description of class StringMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public final class StringMain
{  public static void main(String[] args ) {
       String str;
       String ans ,space ,digits , other;
       Scanner in = new Scanner(System.in);
       Str3 s = new Str3();
       do {
          System.out.println("String Manipulator");
          System.out.println("Developed using OOP Approach");

          System.out.println("Developed by Catillo, Kim Allen C.");
          System.out.print("Enter a String of any size: ");
          str = in.nextLine();
          s.set(str);
         System.out.println("\nOutput #1:");
          space = s.prt2();
          System.out.println("\nOutput #4:");
          digits = s.prt3();
          System.out.println("\nOutput #5:");
          other = s.prt5();
         
          System.out.print("\n\nTry again ? ");
          ans = in.nextLine();
        } while ( ans.equalsIgnoreCase("Y"));
   }
}   