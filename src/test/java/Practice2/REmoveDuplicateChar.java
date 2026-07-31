package Practice2;

import java.util.Arrays;
import java.util.Collections;

public class REmoveDuplicateChar {

	public static void main(String[] args) {

		int arr[] = { 5, 1, 5, 2, 2 };
		Arrays.sort(arr);

		int[] result = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				result[j] = arr[i];
				j++;

			}
		}
		result[j] = arr[arr.length - 1];
		// j++;

		for (int i = 0; i <= j; i++) {
			System.out.print(result[i] + " ");

		}
	}

}
