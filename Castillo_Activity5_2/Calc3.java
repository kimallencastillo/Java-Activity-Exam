//Program: Calc3.java
public final class Calc3 {
	public float n1, n2;
	public float max, min, remainder;
	
	public float calcRemainder() {
		return n1 % n2 ;
		}
	
	public float calcMax() {
		if(n1  > n2) 
			max = n1;
		else if(n2 > n1)
			max = n2;
		
			return max;
	}
	public float calcMin() {
			if( n1 == 0 || n2 == 0) {
				min = n1;
				min = n2;
			}
			else {
			if(n1 < n2) 
				min = n1;
			else 
				min = n2;
			}
			return min;
	}
	
	public void set (float v1, float v2) {
		n1 = v1;
		n2 = v2;
		}
}
