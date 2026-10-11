package October_2026_Programms;

public class FindSecondDuplicateChar {

	public static void main(String[] args) {

//    	Explanation
//    	1. str.indexOf(c) != str.lastIndexOf(c) — Checks whether the character is repeated.
//    	2. str.indexOf(c) == i — Ensures the character is counted only once.
//    	3. count++ — Counts distinct duplicate characters.
//    	4. count == 2 — Finds the second distinct duplicate character.
//    	5. break — Stops the loop once the result is found.

		String str = "abbcddeffgh";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (str.indexOf(c) != str.lastIndexOf(c) && str.indexOf(c) == i) {

				count++;

				if (count == 2) {
					System.out.println("Second duplicate: " + c);
					break;
				}
			}
		}
	}
}