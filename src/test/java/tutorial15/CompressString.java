package tutorial15;

public class CompressString {

	public static void main(String[] args) {

		String str = "aabbbcccc";

		for (int i = 0; i < str.length(); i++) {

			int count = 1;

			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {

				count++;
				i++;
			}

			System.out.print(str.charAt(i) + "" + count);
		}
	}

}
