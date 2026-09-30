package TodayPractice;

public class Program_04_RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "programming";

		int arr[] = new int[126];

		for (int i = 0; i < str.length(); i++) {

			if (arr[str.charAt(i)] == 0) {

				System.out.print(str.charAt(i));
			

				arr[str.charAt(i)] = 1;
				
			}
		}
		
	}
}