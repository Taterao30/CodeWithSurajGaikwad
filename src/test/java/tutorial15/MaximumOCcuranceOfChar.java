package tutorial15;

public class MaximumOCcuranceOfChar {

	public static void main(String[] args) {
		String str = "programming";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = 0;
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);

			}
		}
		System.out.println(c);

	}

}
