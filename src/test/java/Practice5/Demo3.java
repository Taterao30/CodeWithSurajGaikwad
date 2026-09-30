package Practice5;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		String str = "suraj";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			map.put(str.charAt(i), 1);
		}
		System.out.println(map);

	}

}
