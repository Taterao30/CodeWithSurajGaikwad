package October_2026_Programms;

public class SortWords {

	public static void main(String[] args) {

		String str = "Java Selenium Playwright API Automation";

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].compareTo(words[j]) > 0) {

					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}

		System.out.println(String.join(" ", words));
	}
}

//Interview explanation (4 lines)
//1. First, I split the string into words using split(" ").
//2. I use two nested loops to compare the words.
//3. I use compareTo() for alphabetical sorting or length() for length-based sorting.
//4. If the condition is true, I swap the words and print the sorted result.