package Practice4;

public class RemoveWhiteSpacesFromTheString {

	public static void main(String[] args) {

		String str = "su1r2j3";
		char[] arr = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (Character.isDigit(arr[left])) {
				left++;
			}

			else if (Character.isDigit(arr[right])) {
				right--;
			}

			else {
				left++;
				right--;
			}
		}
		System.out.println(new String(arr));

	}

}
