package tutorial15;

public class FindShortString {

	public static void main(String[] args) {
		String str = "This is java java is simple".toLowerCase();
		String[] result = str.split(" ");
		String shortWord = result[0];

		for (String word : result) {
			if (word.length() < shortWord.length()) {
				shortWord = word;
			}
		}
		System.out.println(shortWord);

	}

}
