package October_2026_Programms;

public class ReverseOnlyString {

	public static void main(String[] args) {

		// String str = "suraj123";
		String str = "123suraj";

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isLetter(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}

		System.out.println(builder);

	}

}
