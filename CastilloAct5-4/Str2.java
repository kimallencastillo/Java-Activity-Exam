
public abstract class Str2 {
	String n1, n2, spc = "";
	int i;
	
	public String prt4() {
		
		for(i = 0 ; i < n1.length() ; i++ ) { 
			System.out.println(":" + n1.charAt(i));
		}
		return "";
		
	}
	
	public String prt5() {
		for(i = n1.length()-1 ; i >=0 ; i-- ) { 
			   
			System.out.println(n1.charAt(i)+ "]");
		}
		return "";
	}
	public String prt6() {
		
		for(i = 0 ; i < n1.length(); i++) {
			
			System.out.println(spc + n1.charAt(i));
			spc = spc + " ";	
		}
		System.out.print(spc + "=");
		
		return "";
	}
		
}
