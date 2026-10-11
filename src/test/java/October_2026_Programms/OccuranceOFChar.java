
package October_2026_Programms;

public class OccuranceOFChar {

	public static void main(String[] args) {

		String str = "automation";

		int arr[] = new int[126];

		// Step 1: Count occurrences
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		// Step 2: Print in original order
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (arr[ch] > 0) {
				System.out.println(ch + " " + arr[ch] + " times");

				arr[ch] = 0;
			}
		}
	}
}
