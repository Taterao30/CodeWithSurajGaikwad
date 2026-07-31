package Practice;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 4, 5, 5 };

		int[] temp = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}

		// Add the last element
		temp[j] = a[a.length - 1];
		j++;

		System.out.println("After removing duplicates:");

		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
