package Arrays_Programs;

public class Program_04_SecondMin {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5 };

		int min = arr[0];

		int secMin = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				secMin = min;
				min = arr[i];
			} else if (arr[i] < secMin && arr[i] != min) {
				secMin = arr[i];
			}
		}
		System.out.println("Second min ele is an array: " + secMin);
	}

}
