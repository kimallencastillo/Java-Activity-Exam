
public final class Payroll extends Employee {
float sum1,sum2, regHr, regPay = 0, tHr , OtHr, Opay, gross, tax, netPay;
	
	public void prtTotalRegHts() {
		System.out.println("\tEmployee No.     Employee Name      "
				+ "Total Regular Hours to Mon-Friday");
		for(ctr = 0 ; ctr < mon.length ; ctr++) {
			tHr = mon[ctr] + tues[ctr] + wed[ctr] + 
					thur[ctr] + fri[ctr]; 
			sum2 = sat[ctr] + sun[ctr];
			   System.out.println("\t "+ empNos[ctr] + " \t         " + 
			empNames[ctr] + "\t    " + tHr);
		       
				
		}
	}
	public void prtTotalOTHts() {
		System.out.println("\tEmployee No.     Employee Name      "
				+ "Total OverTime Hours to Sat-Sunday");
		
		for(ctr = 0 ; ctr < mon.length ; ctr++) {
			tHr = mon[ctr] + tues[ctr] + wed[ctr] + 
					thur[ctr] + fri[ctr]; 
			OtHr = sat[ctr] + sun[ctr];
			   System.out.println("\t "+ empNos[ctr] + " \t         " + 
			empNames[ctr] + "\t    " + OtHr);
		}
	}
	public void prtPayroll() {
		System.out.println("\tEmployee No.     Employee Name          Regular Pay    OverTime Pay     Grosspay      Tax       NetPay");
		
		for(ctr = 0 ; ctr < mon.length ; ctr++) {
			regHr = mon[ctr] + tues[ctr] + wed[ctr] + 
					thur[ctr] + fri[ctr]; 
			OtHr = sat[ctr] + sun[ctr];
			Opay = OtHr * empRates[ctr] * 1.25f;
			gross = regPay + Opay;
			tax = 0.1f * gross;
			netPay = gross - tax;
			regPay = regHr * empRates[ctr];
			   System.out.println("\t "+ empNos[ctr] + " \t         " + 
			empNames[ctr] + "\t" + regPay + "\t       " + Opay + "\t        " + gross + "\t      " + tax + "\t" + netPay);
		}
	}
}
