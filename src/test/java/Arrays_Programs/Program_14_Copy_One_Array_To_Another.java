package Arrays_Programs;

import java.util.Arrays;
import java.util.*;
public class Program_14_Copy_One_Array_To_Another {
	
	
	public static void main(String[] args) {

		int[] original = { 10, 20, 30, 40, 50 };

		int[] copied = new int[original.length];

		for (int i = 0; i < original.length; i++) {
			copied[i] = original[i];
		}

		System.out.println("Original array: " + Arrays.toString(original));
		System.out.println("Copied array: " + Arrays.toString(copied));
	}

}
