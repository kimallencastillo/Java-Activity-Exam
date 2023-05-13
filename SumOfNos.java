/**
 * Write a description of class CalcSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  SumOfNos { 
    public static int calcSum( int n1, int n2, int n3 ) {
         int sum;
         sum = n1 + n2 + n3;
         return sum;
    } 
    public static int calcProd( int n1, int n2, int n3 ) {
         int prod;
         prod = n1 * n2 * n3;
         return prod;
    } 
    public static void main( String [] args ) {
        System.out.println("Sum is " + calcSum(1,2,3));
        System.out.println("Product is " + calcProd(1,2,3));
        System.out.print("Highest is " + findHigh(1,2,3));
        System.out.print("Lowest is " + findLow(1,2,3));
    }
}
