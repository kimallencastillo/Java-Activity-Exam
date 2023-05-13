public class Main {
	public static void main(String[] args) {
		int[] number = {10, 5, 3, 7, 2};
		int temp = 0;
		int j , i;
		for(i = 1 ; i < 5 ; i++)
		{
			temp = number[i];
			j = i - 1;
			while(j >= 0 && number[j]> temp) {
				number[j + 1] = number[j];
				j--;
			}
                        number[j + 1] = temp;
		}
		for(i = 0 ; i < 5 ; i++) {
			System.out.print(number[i] + " ");
		}
	}
}