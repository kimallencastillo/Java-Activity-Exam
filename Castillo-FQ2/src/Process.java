import java.util.*;
public class Process {
	char tranType;
	float balance;
	float tranAmt , newBal;
	String status;
	
	
	public void printNewBal() {
		if(tranType == 'W' || tranType == 'w') {
		newBal = balance - tranAmt;
		}
		else if(tranType == 'D' || tranType == 'd') {
		newBal = balance + tranAmt;		
	}
		System.out.println("\t\tNew Balance: " + newBal);
		
	}
	public void printStatus() {
		if(newBal <= 0)
			status = "Closed";
		else
			status ="Active";
		System.out.println("\t\tStatus: " + status);
		
	}
	public void set(char type, float bal, float amt) {
		tranType = type ;
		balance = bal  ;
		tranAmt = amt;
	}
}
