package tutorial15;

import java.util.*;

public class FindAOccuranceOfWordsInString {

	public static void main(String[] args) {

		String str = " This is  Suraj is the best";
		str = str.toLowerCase();
		String[] str1 = str.split("\\s+");
		;

		Map<String, Integer> map = new HashMap<String, Integer>();

//		for(String word:str1)
//		{
//			map.put(word, map.getOrDefault(word, 0)+1);
//		}
//		System.out.println(map);

		for (String word : str1) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);

			} else {
				map.put(word, 1);
			}
		}
		int max = 0;
		String maxString = "";

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxString = entry.getKey();

			}
		}
		System.out.println(maxString);

	}

}
