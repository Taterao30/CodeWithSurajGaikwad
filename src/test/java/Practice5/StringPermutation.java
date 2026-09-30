package Practice5;

public class StringPermutation {

	static void permutation(String str, String ans) {

		// Base condition
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		// Choose every character one by one
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// Remaining string after removing chosen character
			String remaining = str.substring(0, i) + str.substring(i + 1);

			// Recursive call
			permutation(remaining, ans + ch);
		}
	}

	public static void main(String[] args) {

		String str = "abc";

		permutation(str, "");
	}
}