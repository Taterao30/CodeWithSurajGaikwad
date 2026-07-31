package Practice;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 4, 2, 5 };

		int[] result = new int[arr.length];
		int index = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				result[index] = arr[i];
				index++;
			}

		}
		result[index] = arr[arr.length - 1];

		for (int i = 0; i <= index; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
