public final class CastilloAct4_2_sub {
	
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

	public void calcGross() {

	    grossWage = empRate * empHrs;

	}

	public void calcTax() {

	    tax = .10f * grossWage;

	}

	public void calcNet() {

	    netPay = grossWage - tax;

	}

	public void dispPay() {

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
