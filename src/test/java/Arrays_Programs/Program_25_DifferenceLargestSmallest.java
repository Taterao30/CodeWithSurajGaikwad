package Arrays_Programs;

public class Program_25_DifferenceLargestSmallest {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 20, 5, 40 };

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
			
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		int difference = largest - smallest;

		System.out.println("Largest element: " + largest);
		System.out.println("Smallest element: " + smallest);
		System.out.println("Difference: " + difference);
	}
}
