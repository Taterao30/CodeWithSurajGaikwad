package October_2026_Programms;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharInString {

	// c appears 4 times → Second highest

	public static void main(String[] args) {
		
		String input = "aabbbccccddddd";

		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

		for (char inputChar : input.toCharArray()) {

			hMap.put(inputChar, hMap.getOrDefault(inputChar, 0) + 1);
		}

		System.out.println(hMap);

		// Find the 2nd most frequent character in the String!!
		int firstMaxFrequency = 0;
		int secondMaxFrequency = 0;

		for (Map.Entry<Character, Integer> entrySet : hMap.entrySet()) {

			int currentFrequency = entrySet.getValue();

			if (currentFrequency > firstMaxFrequency) {

				secondMaxFrequency = firstMaxFrequency;
				firstMaxFrequency = currentFrequency;

			} else if (currentFrequency > secondMaxFrequency && (currentFrequency < firstMaxFrequency)) {

				secondMaxFrequency = currentFrequency;
			}
		}

		System.out.println(secondMaxFrequency);

		for (Map.Entry<Character, Integer> entrySet : hMap.entrySet()) {

			if (entrySet.getValue() == secondMaxFrequency) {

				System.out.println(entrySet.getKey());
			}
		}
	}
}

//Find the second highest
//- d appears 5 times → First highest
//- c appears 4 times → Second highest
//- b appears 3 times → Third highest
//- a appears 2 times → Fourth highest