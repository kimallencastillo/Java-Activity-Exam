
import java.util.Scanner;
public class Castillo {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		String subj = " " , course = " ",date = " ", stdNum = "";
		System.out.println("Problem Number#2");
		System.out.println("Created By, Castillo, Kim Allen C.");
		System.out.println();
		
		System.out.print("\tEnter your Name:           ");
		name = input.nextLine();
		
		System.out.print("\tEnter your Course:         ");
		course = input.nextLine();
		
		System.out.print("\tEnter your Student Number: ");
		stdNum = input.nextLine();
		//int stdNum = Integer.parseInt(input.nextLine());
		
		System.out.print("\tEnter your Subject:        ");
		subj = input.nextLine();
		
		System.out.print("\tEnter the Date Today:      ");
		date = input.nextLine();
		
		System.out.println();
		System.out.println("\t Name:         " + name);
		System.out.println("\t Course:       " + course);
		System.out.println("\t Student Name: " + stdNum);
		System.out.println("\t Subject:      " +subj);
		System.out.println("\t Date:         "  + date);

	}

}
