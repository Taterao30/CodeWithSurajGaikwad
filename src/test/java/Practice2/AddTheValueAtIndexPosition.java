package Practice2;

import java.util.Arrays;

public class AddTheValueAtIndexPosition {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6 };

		int pos = 4; // 4th position
		int element = 4;

		int index = pos - 1; // Convert position into array index

		int[] newArr = new int[arr.length + 1];

		// Copy elements before the insertion position
		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		// Insert the new element
		newArr[index] = element;

		// Copy the remaining elements
		for (int i = index; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		System.out.println(Arrays.toString(newArr));
	}
}