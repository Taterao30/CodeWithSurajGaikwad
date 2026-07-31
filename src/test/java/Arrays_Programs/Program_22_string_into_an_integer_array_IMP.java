package Arrays_Programs;

import java.util.Arrays;

public class Program_22_string_into_an_integer_array_IMP {

	public static void main(String[] args) {

		String str = "10 20 30 40";

		String[] values = str.split(" ");

		int[] numbers = new int[values.length];

		for (int i = 0; i < values.length; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}

		System.out.println(Arrays.toString(numbers));
	}

}
