import javax.swing.JOptionPane;	
import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int[] arr = new int[100];
			int number = 0 ;
			int numb;
			int nItems ;
			
			System.out.println("Enter the Numbers elements: ");
			nItems = input.nextInt();
			
			for(int j = 0 ; j < nItems; j++) {
				number = input.nextInt();
				arr[j] = number;
			}
			

			for(int j = 0 ; j < nItems; j++) {
				System.out.print(arr[j] + " ");
			}
			
			int searchId = 66;
			
			for(int j = 0 ; j  < nItems ; j++) {
				if(arr[j] == searchId)
					break;
				if(j == nItems)
					System.out.println("Can't find " + searchId);
				else{
					System.out.println("Found " + searchId );
				}
			}
			searchId = 55;
			for(int j = 0 ; j  < nItems ; j++) {
				if(arr[j] == searchId)
					break;
				for(int k = j; k < nItems; k++) { 
					arr[k] = arr[k++];
					nItems--;
				}
			}
		for(int j = 0 ; j < nItems; j++) {
			System.out.print( arr[j] + " ");
			System.out.println("");
		}
			/*
			//Declaration 
			int[] N = {5, 2 ,4 ,3 ,8, 7, 9, 10 , 1 };
			int NUM1 = 0 ;
			int LARGE = 0;
			
			
			for(int COUNT = 2; COUNT < N.length ; COUNT++) {
				NUM1 = input.nextInt();
				if(NUM1 > LARGE) {
					LARGE = NUM1;
				
				}
				if(COUNT == N[COUNT]) {
					 System.out.println(LARGE);					
				}
				else {
					COUNT++;
					return;
				}
				
			}
	     */
		}
	
	}
