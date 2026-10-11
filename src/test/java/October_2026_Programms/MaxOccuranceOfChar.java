package October_2026_Programms;

public class MaxOccuranceOfChar {

	public static void main(String[] args) {

		String str = "aaaabccccdddd";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = 0;
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				c = str.strip().charAt(i);
			}
		}
		System.out.println(c);

		// Min occurance of char

		int min = str.length() - 1;

		char minChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] < min) {
				min = arr[str.charAt(i)];
				minChar = str.charAt(i);
			}
		}
		System.out.println(minChar);

	}

}
