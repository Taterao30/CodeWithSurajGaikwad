
package October_2026_Programms;

public class FindFirstDuplicateChar {

	public static void main(String[] args) {

		String str = "abbcddeffgh";

		for (char c : str.toCharArray()) {

			if (str.indexOf(c) != str.lastIndexOf(c)) {

				System.out.println("first duplicate: " + c);
				break;
			}
		}
	}

}
