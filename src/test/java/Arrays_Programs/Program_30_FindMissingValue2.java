package Arrays_Programs;

public class Program_30_FindMissingValue2 {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 70 };

		for (int number = 10; number <= 70; number = number + 10) {

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
