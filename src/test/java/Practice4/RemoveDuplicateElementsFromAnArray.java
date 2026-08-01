package Practice4;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 4, 5 };
		Arrays.sort(arr);
		int newArr[] = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArr[j] = arr[i];
				j++;
			}
		}
		newArr[j] = arr[arr.length - 1];
		j++;

		for (int i = 0; i < j; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
