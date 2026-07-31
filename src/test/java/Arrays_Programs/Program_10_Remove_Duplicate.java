package Arrays_Programs;

import java.util.*;

public class Program_10_Remove_Duplicate {

	public static void main(String[] args) {

		// Integer[] arr = { 10, 20, 30, 10, 20 };
		Integer[] arr = { 10, 20, 30, 10, 40, 20 };

		Set<Integer> uniqueElements = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(uniqueElements);
	}

}
