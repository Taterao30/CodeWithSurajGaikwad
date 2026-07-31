package Practice;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {

		int arr[] = { 7, 1, 1, 2, 7, 2, 3, 4, 5 };

//		Arrays.sort(arr);
//
//		int result[] = new int[arr.length];
//
//		int j = 0;
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] != arr[i + 1]) {
//				result[j] = arr[i];
//				j++;
//
//			}
//
//		}
//		result[j] = arr[arr.length - 1];
//		j++;
//
//		for (int i = 0; i < j; i++) {
//			System.out.print(result[i] + " ");
//		}
		System.out.println("After removing duplicates:");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int number : arr) {
			map.put(number, map.getOrDefault(number, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
