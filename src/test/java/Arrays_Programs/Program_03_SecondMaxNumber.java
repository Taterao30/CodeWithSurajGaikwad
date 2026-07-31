package Arrays_Programs;

public class Program_03_SecondMaxNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 2, 5 };

		int max = arr[0];
		int secMax = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}

		}
		System.out.println("Max number from an array: " + max);
		System.out.println("Second max number of an array: " + secMax);
	}

}
