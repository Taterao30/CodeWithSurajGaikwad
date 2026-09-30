package Practice5;

public class FindTheMissingElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };

		int actualSum = 0;
		int expectedSum = 0;

		// Sum of array elements
		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}
		System.out.println(actualSum);
		// Sum of numbers from 1 to 5
		for (int i = 1; i <= 5; i++) {
			expectedSum = expectedSum + i;
		}

		int missingNumber = expectedSum - actualSum;

		System.out.println("Actual sum: " + actualSum);
		System.out.println("Expected sum: " + expectedSum);
		System.out.println("Missing number: " + missingNumber);
	}
}