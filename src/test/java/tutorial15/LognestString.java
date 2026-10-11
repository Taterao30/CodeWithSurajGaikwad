package tutorial15;

public class LognestString {

	public static void main(String[] args) {
		String str = "java automation testing interview";

		String[] words = str.split(" ");
		String longest = words[0];

		for (int i = 0; i < words.length; i++) {
			if (longest.length() < words[i].length()) {
				longest = words[i];
			}
		}
		System.out.println(longest);
	}

}
