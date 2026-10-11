
package October_2026_Programms;

import java.util.*;

public class FindSecondNonDupCharFromTheString {

	public static void main(String[] args) {

		String str = "automation";
		int count = 0;

		Map<Character, Integer> map = new HashMap<>();

		// Step 1: Count character occurrences
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Step 2: Find second non-duplicate character
		for (char c : str.toCharArray()) {

			if (map.get(c) == 1) {
				count++;

				if (count == 2) {
					System.out.println("Second non-duplicate: " + c);
					break;
				}
			}
		}
	}
}
