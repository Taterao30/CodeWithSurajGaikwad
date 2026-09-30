package MidNightPrograms;

public class ReverseOnlyCharacter {

	public static void main(String[] args) {

		String str = "mu1m4ba5i";
		char[] arr = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (Character.isDigit(arr[left])) {
				left++;
			} else if (Character.isDigit(arr[right])) {
				right++;

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
