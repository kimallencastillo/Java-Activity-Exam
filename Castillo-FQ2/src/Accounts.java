/**
 * Write a description of class MEQ2 here.
 *
 * @author K.Castillo
 * @version (January, 13 , 2021)
 */
public final class Accounts {
	
	int[] acctNos = {11, 12, 13, 14};
	String[] acctNames = {"Nadal, Rafael", "Trump Donald", "Biden, Joe", "Ginobili, Manu"};
	float[] acctBal = {1000,5000,6000,4000};
	int aNo, i , ctr, idx;
	float bal;
	String name;
	public int search(int num) {
		for(ctr = 0 ; ctr < acctNos.length ; ctr++) {
			if(acctNos[ctr] == num)
				return ctr;
		}
		return ctr;
	}
	public void set(int num) {
		idx = search(num);
		if(idx != -1)
			aNo = acctNos[idx];
		num = aNo;
	}
	public void prtAccts() {
		System.out.println("\t    List of Accounts");
		System.out.println("\tAccount No.  Account Name     Balance");
		for(ctr = 0; ctr < acctNos.length ; ctr++) {
			System.out.println("\t" +acctNos[ctr] +
					"           " + acctNames[ctr] + "   " + acctBal[ctr]);
		}
		System.out.println();
	}
	void prtName() {
		idx = search(aNo);
		if(idx != -1) {
			name = acctNames[idx];
		}
		System.out.println("\t\tName: " + name);
	}
	
	void prtBal() {
		idx = search(aNo);
		if(idx != -1) {
			bal = acctBal[idx];
		}
		System.out.println("\t\tBalance: " + bal);
	
	}
	public String getName() {
		idx = search(aNo);
		if(idx != -1) {
			name = acctNames[idx];
		}
		return name;
	}
	
	public float getBal() {
		idx = search(aNo);
		if(idx != -1) {
			bal = acctBal[idx];
		}
		return bal;
	}
}
