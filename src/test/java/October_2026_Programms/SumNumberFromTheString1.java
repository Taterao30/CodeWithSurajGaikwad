package October_2026_Programms;

public class SumNumberFromTheString1 {

	public static void main(String[] args) {

		String str = "su1ra2j3";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				sum = sum + (str.charAt(i) - '0');
			}
		}

		System.out.println("Sum of digits: " + sum);
	}
}