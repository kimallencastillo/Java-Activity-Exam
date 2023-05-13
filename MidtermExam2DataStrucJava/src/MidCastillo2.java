import java.util.Arrays;
public class MidCastillo2 {
	static int[] arr1 = {12,15,40,42,57,89};
	static int[] arr2 = {8, 17, 35, 56, 88};
	static int i , j , k;

	public static void main(String[] args) {
		int[] mergArr = mergedArr(arr1, arr2);
		
		System.out.println("Arr1 is: " + Arrays.toString(arr1));
		System.out.println("Arr2 is: " + Arrays.toString(arr2));
		
		String merged = Arrays.toString(mergArr);
        System.out.println("Arr3 is: " + merged);
        System.out.println("Castillo, Kim Allen C.");
    }
		
		
	static int[] mergedArr(int[] arr1, int[] arr2) {
		i = 0; j = 0; k = 0;
		int[] mergArr = new int[arr1.length + arr2.length];
		
		while (i < arr1.length) 
        {
            mergArr[k] = arr1[i];
            i++;
            k++;
        } 
                 
        while (j < arr2.length) 
        {
            mergArr[k] = arr2[j];
            j++;
            k++;
        } 
             
        Arrays.sort(mergArr);
      
		return mergArr;
	}

}
