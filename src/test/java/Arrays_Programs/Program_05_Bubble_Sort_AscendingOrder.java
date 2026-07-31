package Arrays_Programs;

public class Program_05_Bubble_Sort_AscendingOrder {

	public static void main(String[] args) {

		int temp = 0;

		int arr[] = { 1, 4, 3, 2, 5, 6 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
