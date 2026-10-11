package October_2026_Programms;

import java.util.regex.*;

public class CountTheTotalSubString {

	public static void main(String[] args) {

		String str = "This is java java is super";

		String updatedString = str.toLowerCase();

		String SubString = "java";

		Pattern pattern = Pattern.compile(SubString);
		Matcher matcher = pattern.matcher(updatedString);

		int count = 0;

		while (matcher.find()) {
			count++;
		}

		System.out.println(count);

	}

}
