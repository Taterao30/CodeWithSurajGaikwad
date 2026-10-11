package October_2026_Programms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsFromTheString {

	public static void main(String[] args) {

		String str1 = "The Mother";
		String str2 = "Mother";

		String str3 = str1 + " " + str2;

		String[] str4 = str3.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String word : str4) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		System.out.println(map);

	}

}
