package Arrays_Programs;

import java.util.Arrays;

public class Program_11_MergeTwoArrayInOne {

	public static void main(String[] args) {

		int[] first = { 10, 20, 30 };
		int[] second = { 40, 50, 60 };

		int index = 0;

		int result[] = new int[first.length + second.length];

		for (int i = 0; i < first.length; i++) {
			result[index] = first[i];
			index++;
		}

		// System.out.println(Arrays.toString(result));

		for (int i = 0; i < second.length; i++) {
			result[index] = second[i];
			index++;
		}

		System.out.println(Arrays.toString(result));

	}

}
