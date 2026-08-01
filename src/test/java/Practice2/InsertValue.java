package Practice2;

import java.util.Arrays;

public class InsertValue {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7 };

		int[] newArr = new int[arr.length + 1];

		int pos = 5;
		int element = 5;
		int index = pos - 1;

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];

		}

		newArr[index] = element;

		for (int i = index; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

}
