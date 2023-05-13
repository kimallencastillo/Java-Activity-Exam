import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class Reverse {
	static String output;
	static String[] input = { "a" , "b", "c", "d", "e"};
	static int i;


	public static void main(String[] args) {
		
		String before = Arrays.toString(input);
		System.out.println("input is " + before);
		
		String after = doRev();
		System.out.println("Reversed is " + after);
	}
	public static String doRev() {

		int stackSize = input.length;
		
		Stack<String> theStack = new Stack<String>();
		
		for(i = 0 ; i < input.length; i++) {
			theStack.push(input[i]);
		}
		output = " ";
		String[] rev = new String[stackSize];
		
		for(i = 0 ; i < stackSize; i++) {
			rev[i] = theStack.pop();
		}
		
		output = Arrays.toString(rev);
		
		return output;
	}

}
