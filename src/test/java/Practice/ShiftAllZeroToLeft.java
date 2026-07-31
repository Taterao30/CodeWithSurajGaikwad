package Practice;

import java.util.Arrays;

public class ShiftAllZeroToLeft {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 0, 0 };
		int[] newArr = new int[arr.length];

		int index = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				newArr[index] = arr[i];
				index--;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}
