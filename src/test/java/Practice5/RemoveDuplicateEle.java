package Practice5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateEle {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 3, 4, 5 };

		Arrays.sort(arr);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int number : arr) {
			map.put(number, map.getOrDefault(number, 0) + 1);

		}

	}

}
