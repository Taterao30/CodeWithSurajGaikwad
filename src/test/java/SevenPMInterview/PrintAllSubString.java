package SevenPMInterview;

public class PrintAllSubString {

	public static void main(String[] args) {
		int maxOccurance = 0;
		String maxSub = "";
		String str = "abcd";

		for (int i = 0; i < str.length(); i++) {
			String sub = "";
			for (int j = i; j < str.length(); j++) {
				if (sub.indexOf(str.charAt(j)) != -1) {
					break;
				}
				sub = sub + str.charAt(j);

			}

			if (sub.length() > maxOccurance) {
				maxSub = sub;
				maxOccurance = sub.length();

			}

		}
		System.out.println(maxSub);
	}

}
