package tutorial15;

public class ReverseOnlyString {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();

		String str = "taterao123";
		String text = "";
		String number = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isLetter(str.charAt(i))) {
				text = text + str.charAt(i);
			}
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isDigit(str.charAt(i))) {
				number = number + str.charAt(i);
			}
		}
		System.out.println(text + number);
	}
}
