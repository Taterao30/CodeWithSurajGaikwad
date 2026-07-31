package Arrays_Programs;

public class Program_28_ElementsGreaterThanNumber {

	public static void main(String[] args) {

		int[] arr = { 10, 25, 5, 40, 30, 15 };

		int givenNumber = 20;

		System.out.println("Elements greater than " + givenNumber + ":");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > givenNumber) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
