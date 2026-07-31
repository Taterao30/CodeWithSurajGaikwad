package Arrays_Programs;

import java.util.Arrays;

public class Program_12_ShiftAllZerosAtLast {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 0, 0 };

		int index = 0;

		int newArr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}
