package October_2026_Programms;

public class CountPalindromeWords {

	public static void main(String[] args) {

		String str = "madam java level radar selenium noon";

		String[] words = str.split(" ");

		int count = 0;

		for (String word : words) {

			String rev = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}

			if (word.equals(rev)) {
				System.out.println(word);
				count++;
			}
		}

		System.out.println("Total palindrome words: " + count);
	}
}