package Arrays_Programs;

import java.util.Arrays;

public class Program_13_Odd_And_Even_Numbers {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] result = new int[arr.length];

		int evenIndex = 0;
		int oddIndex = arr.length - 1;

		// Only one loop
		for (int number : arr) {

			if (number % 2 == 0) {
				result[evenIndex] = number;
				evenIndex++;
			} else {
				result[oddIndex] = number;
				oddIndex--;
			}
		}

		System.out.println(Arrays.toString(result));
	}
}
