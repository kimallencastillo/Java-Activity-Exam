public final class Str1 extends Str2
{
        public void set (String v1)
{
    n1 = v1;
    
}
    public String prt1()
    {
        for(i = n1.length()-1 ; i > 0 ; i--) 
        { 
	System.out.print(n1.charAt(i)+" ");
	}
	System.out.print(n1.charAt(0));
		return "";
    }
    public String prt2()
    {
        for(i = 0 ; i < n1.length() ; i++ ) 
        { 
	System.out.print(n1.charAt(i));
	if (i != n1.length() - 1)
	System.out.print("-");		
		
       }
       return "";
    }
    public String prt3()
    {
        for(i = 0 ; i < n1.length() ; i++ ) 
        { 
        System.out.print("=");
	}
	System.out.println();
	for(i = 0 ; i < n1.length() ; i++ ) 
        { 
        System.out.print(n1.charAt(i));
	}
	System.out.println();
	for(i = 0 ; i < n1.length() ; i++ ) 
        { 
       	System.out.print("=");
	}
		return "";
    }


}
    