package October_2026_Programms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfWords {

	public static void main(String[] args) {

		String str = "The Pune greate PunePunePune";

		String[] words = str.split(" ");

		Map<String, Integer> map = new LinkedHashMap<>();

		// Step 1: Count normal words
		for (String word : words) {

			if (!word.equals("PunePunePune")) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}

		// Step 2: Count Pune inside PunePunePune
		String temp = "PunePunePune";

		while (temp.startsWith("Pune")) {

			map.put("Pune", map.get("Pune") + 1);

			temp = temp.substring(4);// PunePunePune
		}

		System.out.println(map);
	}

}
