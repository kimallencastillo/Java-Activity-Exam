/* Sample program 

 * that shows how Object-Oriented methodology is implemented in Jac

 */
public class Castillo_Act4_1 {

	public static void main(String[] args) {
		Castillo_Act4_1 pc = new Castillo_Act4_1();

	    pc.setEmp("Castillo Kim Allen",1001,355,36);

	    pc.calcGross();

	    pc.calcTax();

	    pc.calcNet();

	    pc.dispPay();
		

	}

//Class Variables

int empNo;

String empName;

float empHrs, empRate, grossWage, tax, netPay;

//Class Methods

void setEmp( String eNa, int eNo, float eRate,float eHrs) {

    empNo = eNo;

    empName = eNa;

    empHrs = eHrs;

    empRate = eRate;

}

void calcGross() {

    grossWage = empRate * empHrs;

}

void calcTax() {

    tax = .10f * grossWage;

}

void calcNet() {

    netPay = grossWage - tax;

}

void dispPay() {

    System.out.println("Employee Payroll");

    System.out.println("Employee Number : " + empNo);

    System.out.println("Employee Name   : " + empName);

    System.out.println("Hours Worked    : " + empHrs);
    
    System.out.println("Rate            : " + empRate);

    System.out.println("Groseewage      : " + grossWage);
    
    System.out.println("tax             : " + tax);
    
    System.out.println("netPay          : " + netPay);

//  Display also Rate per Hour, Grosswage, Tax, and Netpay

}



}