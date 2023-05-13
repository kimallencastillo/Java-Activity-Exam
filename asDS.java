import java.util.Stack;
import java.util.Arrays;

public class asDS {
	public static String output , input =  "I love Programming" , temp;
	static int i;
	

	public static void main(String[] args) {
		String reverse = doRev();
		System.out.println(reverse);
		
	
	}
	
	static String doRev() {

		
		Stack<String> theStack = new Stack<>();
		
		output = "";
		
		for(i = 0 ; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				theStack.add(output);
				output = "";
			}else
					output = output + input.charAt(i);
		
		}
		  theStack.add(output);
		  theStack.pop();  
		  while(!theStack.isEmpty()){
			 temp  = theStack.peek();
			 output = output + " " + temp;
			 temp = theStack.pop();
			
		}
		  return output;
	}
}