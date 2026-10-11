package tutorial15;

import java.util.regex.*;

public class CountTotalSubStringFromTheString {

	public static void main(String[] args) {
		String str = "this is java java is programming lang java";

		String subString = "java";

		Pattern pattern = Pattern.compile(subString);
		Matcher result = pattern.matcher(str);

		int count = 0;

		while (result.find()) {
			count++;
		}

		System.out.println(count);

	}

}
