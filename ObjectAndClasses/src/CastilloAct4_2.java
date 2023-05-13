/* Sample program 

 * that shows how Object-Oriented methodology is implemented in Jac

 */

//abstract - means incomplete
public class CastilloAct4_2 {

	public static void main(String[] args) {
		
		CastilloAct4_2_sub  pc = new CastilloAct4_2_sub();

		pc.empNo = 1001;
		pc.empName = "Castillo, Kim Allen C.";
		pc.empRate = 355;
		pc.empHrs = 36;
	    
	    pc.calcGross();

	    pc.calcTax();

	    pc.calcNet();

	    pc.dispPay();
		
	    

	}

}

