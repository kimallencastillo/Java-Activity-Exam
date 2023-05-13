
public abstract class Employee
{
	int empNos[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008};
	String empNames[] = {"Duterte, Rodrigo", "Escudero, Francis", "Drilon, Franklin", "Trillianes, Sonny", 
			"Pacquiao, Manny", "Dela Rosa, Bato", "Poe, Grace     ", "Lacson, Ping      "};
	float empRates[] = {300, 200, 300, 400 , 400, 100, 300 , 200};
	float mon[] = {8,7,8,8,8,8,8,5};
	float tues[]= {8,5,8,8,8,8,8,5};
	float wed[] = {6,8,8,8,8,8,8,5};
	float thur[]= {8,8,6,8,8,8,8,5};
	float fri[] = {5,8,6,8,8,8,8,8};
	float sat[] = {3,4,1,0,5,3,5,5};
	float sun[] = {3,4,5,0,2,0,0,8};
	int ctr, idx , aNum;
	
	//print employees
	public void prtEmployess() {
		System.out.println("\n\t\t   List of Employees");
		System.out.println("\tEmployee No.     Employee Name");
		for(ctr = 0 ; ctr < empNos.length ; ctr++) {
			   System.out.println("\t "+ empNos[ctr] + " \t         "
			   		+ "" + empNames[ctr]);
		       
		}
	}
	//print hours
	public void prtHours() {
		System.out.println("\n\tList of Employees Hours Worked Per Day\n");
		System.out.println("\tEmployee No.     Employee Name.                  Rate/Hours");
		for(ctr = 0 ; ctr < empNos.length ; ctr++) {
			   System.out.println("\t "+ empNos[ctr] + " \t        "
			   		+ " " + empNames[ctr] + "\t         " + empRates[ctr]);      
		}
	}
}

