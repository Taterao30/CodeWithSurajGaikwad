package SevenPMInterview;

public class ReverseOnlyString {

	public static void main(String[] args) {

		String str = "su1r2a3j";

		int left = 0;
		int right = str.length() - 1;
		char[] arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(arr[left])) {
				left++;
			} else if (Character.isDigit(arr[right])) {
				right--;
			} else {
				char temp = ' ';
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;

			}
		}
		System.out.println(new String(arr));
	}

}
