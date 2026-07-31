package Arrays_Programs;

import java.util.Arrays;

public class Program_26_SwapFirstLast {
	
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		System.out.println(Arrays.toString(arr));
	}

}
