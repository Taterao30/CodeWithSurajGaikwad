package Practice;

public class UniqueElements {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 30, 40, 20, 50 };

		int[] result = new int[arr.length];

		int index = 0;

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				result[index] = arr[i];
				index++;

			}
		}

		result[index] = arr[arr.length-1];
		index++;

		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}

}
