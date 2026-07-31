package Practice;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 1, 3, 4, 5, 6, };

		Arrays.sort(arr);

		int result[] = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				result[j] = arr[i];
				j++;
			}
		}

		result[j] = arr[arr.length - 1];
		j++;

		for (int i = 0; i < j; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
