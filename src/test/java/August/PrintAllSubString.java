package August;

public class PrintAllSubString {

	public static void main(String[] args) {

		String str = "abcde";

		for (int i = 0; i < str.length(); i++) {
			String sub = "";

			for (int j = i; j < str.length(); j++) {
				if (sub.indexOf(str.charAt(j)) != -1) {
					break;
				}
				sub = sub + str.charAt(j);
			}
			System.out.println(sub + " ");
		}
	}

}
