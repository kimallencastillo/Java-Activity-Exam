
public final class Str3 extends Str2 {
	int spc = 0;
	

	public String prt2() {
		char[] ch = str.toCharArray();
		for(i = 0 ; i < str.length(); i++) {
			if(Character.isSpaceChar(ch[i]))
				spc++;
		}

		System.out.println("Space = " + spc);
		return str;
	}

	public String prt3() {
		for(i = 0 ; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
				digits++;
		}
		System.out.println("Digits =" + digits);
		return str;
	}
	

	public String prt5() {
		for(i = 2 ; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		return str;
	}
	
	
		
}
