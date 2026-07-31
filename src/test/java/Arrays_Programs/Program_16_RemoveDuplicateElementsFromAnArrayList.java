package Arrays_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_16_RemoveDuplicateElementsFromAnArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 3, 2));

//		list.add(10);
//		list.add(20);
//		list.add(10);
//		list.add(30);
//		list.add(20);
//		list.add(40);

		System.out.println("Original list: " + list);

		Set<Integer> uniqueSet = new LinkedHashSet<>(list);

		list.clear();
		list.addAll(uniqueSet);

		System.out.println("After removing duplicates: " + list);
	}
}
