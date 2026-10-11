package tutorial15;

public class FindDuplicateCharactersFromTheString1 {

	public static void main(String[] args) {

		String str = "programming";

		for (int i = 0; i < str.length(); i++) {
			boolean isDuplicate = false;

			for (int j = 1; j < i; j++) {
				
				if(str.charAt(i)==str.charAt(j))
				{
					isDuplicate = true;
				}
			}

			if (isDuplicate) {
				continue;
			}

			for (int k = i + 1; k < str.length(); k++) {
				if (str.charAt(i) == str.charAt(k)) {
					System.out.print(str.charAt(i) + " ");
					break;
				}
			}
		}
	}

}
