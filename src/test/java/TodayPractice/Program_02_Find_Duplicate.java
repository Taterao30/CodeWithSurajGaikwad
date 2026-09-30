package TodayPractice;

public class Program_02_Find_Duplicate {

	public static void main(String[] args) {
		String str[] = { "banana", "Apple", "orange", "Pineapple", "apple" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.print(str[i] + " ");
				}
			}
		}
	}

}
