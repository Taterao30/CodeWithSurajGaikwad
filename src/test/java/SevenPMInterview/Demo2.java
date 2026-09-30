package SevenPMInterview;

public class Demo2 {

	public static void main(String[] args) {

		String str = "Su10ra20j";

		int left = 0;
		int right = str.length() - 1;

		char[] ch = str.toCharArray();

		while (left < right) {
			if (Character.isDigit(ch[left])) {
				left++;
			}

			else if (Character.isDigit(ch[right])) {
				right--;
			}

			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;

			}
		}
		System.out.println(new String(ch));

	}
}
