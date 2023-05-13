import java.util.Scanner;
public class Exercise38 {
    
 public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
		
			}
	String  nameSet = " ", gender = " ", cs = " ", time = " ", a = " ";
	int age;

	
	/*public void genderSet() {
		if(gender.equalsIgnoreCase("F")) 
			 gender = "Female";
		else if(gender.equalsIgnoreCase("M")) 
			 gender = "Male";
		else 
			 gender = "";
			
		
	}
	
	public void civilSet() {
		cs = " "; gender = " ";
		if(cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("F")) { 
			 cs = "Ms";
		}else if(cs.equalsIgnoreCase("M" ) && gender.equalsIgnoreCase("F")) {
			 cs = "Mrs";
		}else if(cs.equalsIgnoreCase("M") || cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("M")) {
			 cs = "Mr";
		}else
			 cs = "";
		
	}
	public void timeSet() {
		time = " ";
		if(time.equals("M")) 
			time = "Good Morning";
		else if(time.equals("A")) 
			 time = "Lively Afternoon";
		else if(time.equals("E")) 
			 time = "Wonderful Evening";
		else 
			time = ""; 
	}
	public String ageSet(int age) {
		if(age < 21)
			a = "kid";
		else if(age > 60)
			a = "Senior";
		else 
			a = "";
		return a;
	}*/
	public void valid() {
		if(gender.equalsIgnoreCase("F")) gender = "Female";
		else if(gender.equalsIgnoreCase("M")) gender = "Male";
		else gender = "";
		
		if(cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("F")) { 
			 cs = "Ms";
		}else if(cs.equalsIgnoreCase("M" ) && gender.equalsIgnoreCase("F")) {
			 cs = "Mrs";
		}else if(cs.equalsIgnoreCase("M") || cs.equalsIgnoreCase("S") && gender.equalsIgnoreCase("M")) {
			 cs = "Mr";
		}else cs = "";
		
		
		if(time.equals("M")) time = "Good Morning";
		else if(time.equals("A")) time = "Lively Afternoon";
		else if(time.equals("E")) time = "Wonderful Evening";
		else time = ""; 
		
		if(age < 21) a = "kid";
		else if(age > 60) a = "Senior";
		else a = "";
		
		
		
		if(gender.isEmpty() && cs.isEmpty() && time.isEmpty()) {
			System.out.println("\t\tError: Wrong Gender , Civil status and Frame Time value inputted "); 
			System.out.println();
		}else 
			if(gender.isEmpty() && cs.isEmpty()) {
			System.out.println("\t\tError: Wrong Gender and Civil status value inputted ");
			System.out.println();
		}else if(time.isEmpty() && gender.isEmpty()) {
			System.out.println("\t\tError: Wrong Gender and Frame time value inputted "); 
			System.out.println();
		}else if(cs.isEmpty() && time.isEmpty()) {
			System.out.println("\t\tError: Wrong Civil status and Frame Time value inputted ");
			System.out.println();
		}else 
			if(gender.isEmpty()) { 
			System.out.println("\t\t\tError: Wrong Gender value inputted "); 
			System.out.println();
		}else if(cs.isEmpty()) { 
			System.out.println("\t\t\tError: Wrong Civil Status value inputted "); 
			System.out.println();
		}else if(time.isEmpty()) {
			System.out.println("\t\t\tError: Wrong Frame Time value inputted");
			System.out.println();
		}
		else {	
			System.out.println("\t\t\t"+ time + "  " + a);
			System.out.println("\t\t\t"+ cs + "  " + nameSet);
		}
		 /*if(cs.isEmpty() && time.isEmpty() && gender.isEmpty()) {
				System.out.println("\t\tError: Wrong Gender , Civil status and Frame Time value inputted "); 
				System.out.println();
			}else if(time.isEmpty() && gender.isEmpty()) {
				System.out.println("\t\tError: Wrong Gender and Frame time value inputted "); 
				System.out.println();
			}else if(cs.isEmpty() && gender.isEmpty()) {
				System.out.println("\t\tError: Wrong Gender and Civil status value inputted ");
				System.out.println();
			}else if(cs.isEmpty() && time.isEmpty()) {
				System.out.println("\t\tError: Wrong Civil status and Frame Time value inputted ");
				System.out.println();
			}else if(cs.isEmpty()) { 
				System.out.println("\t\t\tError: Wrong Gender value inputted "); 
				System.out.println();
			}else if(cs.isEmpty()) { 
				System.out.println("\t\t\tError: Wrong Civil Status value inputted "); 
				System.out.println();
			}else if(time.isEmpty()) {
				System.out.println("\t\t\tError: Wrong Frame Time value inputted");
				System.out.println();
			}else {	
				System.out.println("\t\t\t"+ time + "  " + a);
				System.out.println("\t\t\t"+ cs + "  " + nameSet);
				}*/
		 
		
	}
	public void set(String gen, String civil, String timeF, String name) {
		gender = gen;
		time = timeF;
		cs = civil;
		nameSet = name;
		
	}
	
}
