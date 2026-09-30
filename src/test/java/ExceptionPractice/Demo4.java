package ExceptionPractice;

public class Demo4 {

	public static void main(String[] args) {

		String str = "programming";
	
		int max = 0;
		String longSubString = "";

		for (int i = 0; i < str.length(); i++) {
			String sub = "";

			for (int j = i; j < str.length(); j++) {
				char c = str.charAt(j);

				if (sub.indexOf(c) != -1) {
					break;
				}
				sub = sub + c;

			}
			if (sub.length() > max) {
				max = sub.length();
				longSubString = sub;
			}
		}
		System.out.println("Maximum substring: " + longSubString);
		System.out.println("length of substring: " + max);
	}

}
