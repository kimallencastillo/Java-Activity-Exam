import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
public class EmployeeLinkedList_Castillo {
	static Scanner in = new Scanner(System.in);
	static String nameEmp;
	static int id;
	static LinkedList<String> empList = new LinkedList<String>();
	static LinkedList<Integer> idList = new LinkedList<Integer>();
	
	static LinkedList<String> emp(String name){
		int ctr = 1;
		System.out.println("\t----Enter 10 Employees----\n");
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("\t Employee #" + ctr++);
		System.out.print("\t Enter the Name: ");
		nameEmp = in.next();
		System.out.print("\t Enter the ID: ");
		id = in.nextInt();
		System.out.println();
		idList.add(id);
		empList.add(nameEmp);
		}
	
		return empList;
	}
	public static LinkedList<String> displayEmp(String name){
		LinkedList<String> displayEmp = new LinkedList<String>();
		LinkedList<Integer> displayId = new LinkedList<Integer>();
		
		
		displayEmp.addAll(empList);
		displayId.addAll(idList);
		
		String[] empName = new String[displayEmp.size()];
		int[] empID = new int[displayEmp.size()];
		System.out.println("\t----Display Employees----\n");
		System.out.println("\t   ID.      Employees");

		for(int i = 0 ; i < displayEmp.size() ; i++) {
			empName[i] = displayEmp.get(i);
			empID[i] = displayId.get(i);
			System.out.println("\t   " + empID[i]  + "       " + empName[i]);
		}
		
		return displayEmp;
	}
	public static LinkedList<String> deleteEmp(String name){
		
		System.out.println("\t----Delete Employee----\n");
		System.out.println("\t"+ idList.get(0) + "  " + empList.get(0));
		empList.pop();
		idList.pop();
		
		return empList;
	}
	public static LinkedList<String> searchEmp(String name){
		System.out.println("\t----Search Employee----\n");
		String searchName;
		System.out.print("\tEnter the namee: ");
		searchName = in.next();
		for(String search : empList) {
			if(empList.contains(searchName)) {
				System.out.println("\n\t" + searchName + " is found!");
				break;
			}else {
				System.out.println("\t" + searchName + " not found!");
				break;
			}
		}
		return empList;
	}
	public static void main(String[] args) {
	int menu;
	char ans;
	do {
	System.out.println("\t----List of Option----\n");
	System.out.println("\t[1] - Enter Employees");
	System.out.println("\t[2] - Display Employees");
	System.out.println("\t[3] - Delete Employees");
	System.out.println("\t[4] - Search Employees");
	System.out.println("\t[5] - Exit");
	System.out.print("\nEnter your choice: ");
	menu = in.nextInt();
	
	switch(menu) {
	case 1:
		emp(nameEmp);
		break;
	case 2:
		displayEmp(nameEmp);
		break;
	case 3:
		deleteEmp(nameEmp);
		break;
	case 4:
		searchEmp(nameEmp);
		break;
	case 5:
		System.exit(0);
		break;
	}
	System.out.print("\nType R to return: ");
	ans = in.next().charAt(0);
	}while(ans == 'r' || ans == 'R');
	}

}
