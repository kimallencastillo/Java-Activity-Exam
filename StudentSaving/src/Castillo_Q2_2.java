import java.util.Scanner;
public class Castillo_Q2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declarations
		int studSaving = 0;
		int day = 6;
		int[] cashRev  = new int[6];
		int[] totalExp = new int[6]; 
		int[] savings = new int[6];
		//expenses
		int[] food = new int[6];
		int[] transpo = new int[6];
		int[] load = new int[6];
		int[] others = new int[6];
		int count = 1;
		//Cash Flow for the week
		int totalCash = 0;
		int totalExpens = 0;
		int totalSaving = 0 ;
		int newSaving = 0;
		//Day w/o or with Savings
		int wSave = 0;
		int wOSave = 0;
		int c1 = 0 ;
		int c2 = 0 ;
		
		
		System.out.println("\t\tStudent Cash Flow Analyzer");
		System.out.println("\t\tCreated by Castillo, Kim Allen C");
		System.out.println();
		
		System.out.print("Student Saving Last Week::        ");
		studSaving = input.nextInt();
		System.out.println();
		
		for(int i = 0 ; i < day ; i++) {
			//Input Section
			System.out.println("Day " + count++);
			
			System.out.print("\tCash Recieved::           ");
			cashRev[i] = input.nextInt();
			
			System.out.println("\t   Expenses:: ");
			
			System.out.print("\t\t           Food:: ");
			food[i] = input.nextInt();
			
			System.out.print("\t\t Transportation:: ");
			transpo[i] = input.nextInt();
		
			System.out.print("\t\t           Load:: ");
			load[i] = input.nextInt();
			
			System.out.print("\t\t         Others:: ");
			others[i] = input.nextInt();
		    
			//Get the Total Expenses
			totalExp[i] = food[i] + transpo[i] + load[i] + others[i];
			System.out.print("\tTotal Expenses::          " + totalExp[i]);
			//NewLine
			System.out.println();
			//Get the Savings
			savings[i] = cashRev[i] - totalExp[i];
			System.out.print("\t       Savings::          " + savings[i]);
			//NewLine
			System.out.println();
			
			//Calculation For Cash Flow
			totalCash += cashRev[i];
			totalExpens += totalExp[i];
			
			//Determine the days with or w/o savings
			if(savings[i] > wSave)
				c1 = c1 + 1;
			else if(savings[i] < wOSave)
				c2 = c2 + 1;
			
		
		}
		System.out.println();
		System.out.println("Cash Flow For The Week");
		System.out.println("\t\t Total Cash Recieved:: " + totalCash);
		System.out.println("\t\t      Total Expenses:: " + totalExpens);
		totalSaving = totalCash - totalExpens;
		System.out.println("\t\t       Total Savings:: " + totalSaving);
		System.out.println("\t\t No. Of Days w/o Savings :: " + c2);
		System.out.println("\t\t No. Of Days with Savings:: " + c1);
		newSaving = totalSaving + studSaving;
		System.out.println("\t--------------------------------------------------------------");
		System.out.println("\t\tNew Saving For Next Week:: " + newSaving);
		System.out.println("\t--------------------------------------------------------------");
	}

}
