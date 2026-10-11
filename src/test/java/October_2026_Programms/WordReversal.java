package October_2026_Programms;

import java.util.Arrays;

public class WordReversal {

	public static void main(String[] args) {

		String input = "Java Test";
		StringBuilder finalResult = new StringBuilder();

		String data[] = input.split(" ");
		System.out.println(Arrays.toString(data));

		for (String word : data) {

			char charArray[] = word.toCharArray();

			int left = 0;
			int right = charArray.length - 1;

			while (left < right) {

				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;

				left++;
				right--;
			}

			String result = new String(charArray);

			finalResult.append(result).append(" ");
		}

		System.out.println(finalResult);
	}
}