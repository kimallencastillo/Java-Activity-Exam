
public class Castillo {

	public static void main(String[] args) {
		   int min, n , ctr ;
	        int[] lst = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
	              
	        for ( ctr = 0 ; ctr < 10 ; ctr++ ) {
	            System.out.print ( lst[ctr] + " : ");  //77  99 44 55 22 88 11 0 66 33
	        System.out.println();
	       
	        for ( ctr = 0 ; ctr < 10 ; ctr++ ){
	        	for(int a = 1 ; a < 10 ; a++) {
	        		if ( lst[a] < lst[ctr] )          // if the condition is TRUE
	        		{
	        			n = lst[a];               // n is assigned to value lst[a]
	        			lst[a] = lst[ctr];        // lst[a] is assigned a new lst[ctr]
	        			lst[ctr] = n;              // lst[ctr] is assigned a new n
	        		}
	        	}
	       }
	        for ( ctr = 0 ; ctr < 10 ; ctr++ ) 
	            System.out.print ( lst[ctr] + " : ");

	        }
	        
	        /*for(int a = 1 ; a < 10 ; a++) {
	        	if (lst[a] < lst[ctr] ) // if the condition is TRUE 
	        	{
	        		n = lst[a];         // n is assigned to value lst[a]
	        		lst[a] = lst[ctr]; // lst[a] is assigned a new lst[ctr]
	        		lst[ctr] = n;      // lst[ctr] is assigned a new n
	        	}
	        	
	        }*/
		}

	}
