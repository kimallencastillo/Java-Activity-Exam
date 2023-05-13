import java.util.Stack;
public class ReverseWordCastillo {
	public static String input , output , temp;
	public static char ch;
	public static void main(String[] args) {
		 	
			input = "UNIVERSITY OF PERPETUAL HEALTH";
			System.out.println(" \t'Unreversed Word'  ");
			System.out.println(input);
			System.out.println();

		 	String rev = doRev();
		 	System.out.println("\t 'Reverse Word'");
		 	System.out.println(rev);
		}
		
	public static String doRev(){
		  
		  int stackSize = input.length();
		  Stack<String> theStack = new Stack<>();
		  
		  output = "";
		  
		  for(int i = 0; i < input.length() ; i++) {
			if(input.charAt(i) == ' ') {
				theStack.add(output);
				output = "";
		  	}else {
		  		output = output + input.charAt(i);
		  	}
		  }
		  
		  theStack.add(output);
		  theStack.pop();
		  while(!theStack.isEmpty()) 
		  {
			 temp  = theStack.peek();
			 output = output + " " + temp;
			 temp = theStack.pop();
			
		  }  
		 return output;
		}

	}