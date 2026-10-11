package October_2026_Programms;

public class RemoveDuplicateChars {

	public static void main(String[] args) {

		String str = "automation";
		
		String result = "";

		// If the character is present then it will return the
		// index position of the character
		// If not present then it will return -1
		for (char c : str.toCharArray()) {
			if (result.indexOf(c) == -1) {
				result = result + c;
				
				// automin
				// Removed Duplicate chars: automin
			}

		}
		System.out.println("Removed Duplicate chars: " + result);
	}

}
