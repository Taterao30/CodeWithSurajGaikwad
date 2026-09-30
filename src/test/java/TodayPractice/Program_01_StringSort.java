package TodayPractice;

public class Program_01_StringSort {

	public static void main(String[] args) {

		String str[] = { "banana", "Apple", "orange", "Pineapple" };

		for (int i = 0; i < str.length - 1; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
					String temp = "";

					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;

				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}

}
