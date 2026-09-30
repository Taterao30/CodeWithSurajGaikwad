package SevenPMInterview;

public class OccuranceOfCharacters {

	public static void main(String[] args) {

		String str = "programming";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = 0;
		char maxChar = ' ';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxChar = (char) i;
			}
		}
		System.out.println(maxChar);
	}

}
