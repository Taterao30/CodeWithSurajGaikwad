package Practice2;

import java.util.Arrays;

public class ShiftAllZerosToLeft {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 3, 0, 1, 0 };

		int[] newArr = new int[arr.length];

		int count = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				newArr[count] = arr[i];
				count--;
			}
		}

		System.out.println(Arrays.toString(newArr));

	}
}
