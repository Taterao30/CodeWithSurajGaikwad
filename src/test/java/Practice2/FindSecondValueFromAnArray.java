package Practice2;

public class FindSecondValueFromAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6, 7 };

		int max = arr[0];
		int secMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i]) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println("Second max value from an arrays is: " + secMax);
	}

}
