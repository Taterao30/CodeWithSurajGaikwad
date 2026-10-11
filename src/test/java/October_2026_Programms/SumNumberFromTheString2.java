package October_2026_Programms;

public class SumNumberFromTheString2 {
	public static void main(String[] args) {

		String str = "su10ra20j30";

		int sum = 0;
		int num = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num = num * 10 + (str.charAt(i) - '0');
			} else {
				sum = sum + num;
				num = 0;
			}
		}

		sum = sum + num;

		System.out.println("Sum: " + sum);
	}
}