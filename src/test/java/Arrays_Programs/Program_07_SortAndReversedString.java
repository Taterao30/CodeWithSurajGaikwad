package Arrays_Programs;

public class Program_07_SortAndReversedString {

	public static void main(String[] args) {

		int[] arr = { 100, 10, 20, 30, 40, 50 };

		// Step 1: Sort the array in ascending order
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted array:");

		for (int number : arr) {
			System.out.print(number + " ");
		}

		// Step 2: Reverse the sorted array
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		System.out.println("\nReversed sorted array:");

		for (int number : arr) {
			System.out.print(number + " ");
		}
	}
}