package SevenPMInterview;

public class Demo1 {

	public static void main(String[] args) {

		String str = "su1ra2j3";
		char[] arr = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (Character.isDigit(arr[left])) {
				left++;

			} else if (Character.isDigit(arr[right])) {
				right--;

			} else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println(new String(arr));
	}

}
