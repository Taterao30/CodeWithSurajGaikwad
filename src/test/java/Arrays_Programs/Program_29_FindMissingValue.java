package Arrays_Programs;

public class Program_29_FindMissingValue {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 7 };

		for (int number = 1; number <= 7; number++) {

			boolean found = false;

			for (int i = 0; i < arr.length; i++) {

				if (number == arr[i]) {
					found = true;
					break;
				}
			}

			if (found == false) {
				System.out.println("Missing number: " + number);
			}
		}
	}
}
