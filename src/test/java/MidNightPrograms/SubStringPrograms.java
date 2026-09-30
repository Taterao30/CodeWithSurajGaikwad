package MidNightPrograms;

public class SubStringPrograms {

	public static void main(String[] args) {

		String str = "abcde";

		int max = 0;
		String maxSub = "";

		for (int i = 0; i < str.length(); i++) {
			String sub = "";
			for (int j = i; j < str.length(); j++) {
				if (sub.indexOf(j) != -1) {
					break;
				}
				sub = sub + str.charAt(j);
			}

			if (sub.length() > max) {

				max = sub.length();
				maxSub = sub;
			}

		}
		System.out.println(maxSub);

	}

}
