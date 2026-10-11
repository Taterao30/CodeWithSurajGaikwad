package tutorial15;

public class GenerateOutput {

	public static void main(String[] args) {

		String str = "a2b3c4";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else if (Character.isDigit(str.charAt(i))) {
				int a = Character.getNumericValue(str.charAt(i));

				for (int j = 1; j < a; j++) {
					System.out.print(str.charAt(i - 1));
				}
			}
		}
	}
}
