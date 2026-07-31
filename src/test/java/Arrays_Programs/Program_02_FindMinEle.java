package Arrays_Programs;

public class Program_02_FindMinEle {

	public static void main(String[] args) {

		int arr[] = {  3, 4, 2, 5 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min number of an array is: " + min);

	}

}
