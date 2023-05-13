import java.util.Scanner;
public class MagicSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Magic Square
		
		int num;
	    System.out.println("Enter a Number");
		num = input.nextInt();
	    
		int row = 0 ;
		int col = 1/ 2;
		
		int[][] Ms = new int[num][num];
		
		for(row = 0 ; row < num ; row++) {
			
		}
		
		
		/*System.out.print("Give an odd number: ");
	    int n = input.nextInt();
	    int[][] magicSquare = new int[n][n];

	    int number = 1;
	    int row = 0;
	    int column = n / 2;
	    while (number <= n * n) {
	        magicSquare[row][column] = number;
	        number++;
	        row -= 1;
	        column += 1;
	        if (row == -1) {
	            row = n - 1;
	        }
	        if (column == n) {
	            column = 0;
	        }
	        if (row == 0 && column == n - 1) {
	            column = n - 1;
	            row += 1;
	        } else if (magicSquare[row][column] != 0) {
	            row += 1;
	        }
	    }

	    for (int i = 0; i < magicSquare.length; i++) {
	        for (int j = 0; j < magicSquare.length; j++) {
	            System.out.print(magicSquare[i][j] + " ");
	        }
	        System.out.println();
	    }*/
	}
}
