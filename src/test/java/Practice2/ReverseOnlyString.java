package Practice2;

public class ReverseOnlyString {

	public static void main(String[] args) {

		String str = "suraj123";

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isAlphabetic(str.charAt(i))) {
				sb.append(str.charAt(i));
			}

		}

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
