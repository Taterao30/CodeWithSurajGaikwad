package MidNightPrograms;

public class ExtractNumAndDoTheValidation {

	public static void main(String[] args) {

		String str = "au1t2omat5ion";

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {

				int num = c - '0';

				sum = sum + num;
			}
		}

		System.out.println("Sum = " + sum);
	}
}