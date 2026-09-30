package SevenPMInterview;

public class DoAddition {

	public static void main(String[] args) {

		String str = "t1a3te5r2ao9";

		int num = 0;
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			} else {
				sum = sum + num;
				num = 0;
			}
		}

		System.out.println(sum);

	}

}
