public class StringMain {

	public static void main(String[] args) {
		String s = "ABCDE";
		String ver , inverse , diag;
		Str1 cp = new Str1();
		
		cp.set(s);
		ver = cp.prt4();
		System.out.println();
		inverse = cp.prt5();
		System.out.println();
		diag = cp.prt6();
		
		//System.out.println(ver);
		//System.out.println(inverse);
		//System.out.println(diag);
	}

}
