package Arrays_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program_09_FindDuplicateElementsFromAnArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 10, 40, 20 };

		System.out.println("Duplicate elements: ");

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//
//					System.out.println(arr[i]);
//					break;
//				}
//			}
//		}
//	}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int number : arr) {
			map.put(number, map.getOrDefault(number, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
