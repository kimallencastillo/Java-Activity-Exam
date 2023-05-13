import java.util.Scanner;
public class CastilloAct10 {

	public static void main(String[] args) {
		//Declaration
		Scanner in = new Scanner(System.in);
		GreetProc pt = new GreetProc();
		
		String name, gender, cs, time;
		int age;
		char ans;
		
		do {
		System.out.println("\t\tGreeting Program \n\t\t\tby\n\t\tCastillo,Kim Allen C.");
		System.out.println("=======================================================");
		System.out.print("\t    Enter Lastname: ");
		name = in.next();
		System.out.print("\tEnter Gender [F/M]: ");
		gender = in.next();
		System.out.print("  Enter Civil Status [S/M]: ");
		cs = in.next();
		System.out.print(" Enter Time Frame  [M/A/E]: ");
		time = in.next();
		System.out.print("Enter Age  [18 to 65 only]: ");
		age = in.nextInt();
		
		
		String ageOutput = pt.ageSet(age);
		String frame = pt.timeSet(time);
		String genderChck = pt.genderSet(gender);
		String civilStat = pt.civilSet(cs, gender);
		
		System.out.println();
		
		//Validation
		
		if(genderChck.isEmpty()) { 
			System.out.println("\t\t\tError: Wrong value inputted "); 
			System.out.println();
		}else if(civilStat.isEmpty()) { 
			System.out.println("\t\t\tError: Wrong value inputted "); 
			System.out.println();
		}else if(frame.isEmpty()) {
			System.out.println("\t\t\tError: Wrong value inputted");
			System.out.println();
		}else {	
			System.out.println("\t\t\t"+ frame + " " + ageOutput);
			System.out.println("\t\t\t"+ civilStat + ". " + name);
			}
		System.out.println();
		System.out.println("=======================================================");
		System.out.print("Try Again (Y/N)? ");
		ans = in.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
	}
}
class GreetProc {
	String  gender, cs, time, a;
	int age;

	
	String genderSet(String gender) {
		if(gender.equalsIgnoreCase("F")) 
			gender = "Ms";
		else if(gender.equalsIgnoreCase("M")) { 
			gender = "Mr";
		}else 
			gender = "";
		
		return gender;	
	}
	
	String civilSet(String cs, String gender) {
		if(cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("F")) { 
			return cs = "Ms";
		}else if(cs.equalsIgnoreCase("M" ) && gender.equalsIgnoreCase("F")) {
			return cs = "Mrs";
		}else if(cs.equalsIgnoreCase("M") || cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("M")) {
			return cs = "Mr";
		}else
			return cs = "";
	}
	String timeSet(String time) {
		if(time.equals("M")) {
			time = "Good Morning";
		}else if(time.equals("A")) {
			time = "Lively Afternoon";
		}else if(time.equals("E")) {
			time = "Wonderful Evening";
		}else 
			time = "";
		
		return time;
	}
	String ageSet(int age) {
		if(age >=1 && age <= 18)
			a = "kid";
		else if(age >= 19 && age <=59) a = " ";
		else if(age >= 60 && age <= 65)
			a = "Senior";
		else 
			a = " ";

		return a;
	}
	
	
}