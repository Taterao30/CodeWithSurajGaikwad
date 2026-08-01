package Practice2;

public class FindMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5 };

		for (int number = 1; number <= 5; number++) {
			boolean flag = false;

			for (int i = 0; i < arr.length; i++) {
				if (number == arr[i]) {
					flag = true;
					break;

				}
			}
			if (flag == false) {
				System.out.println(number);

			}

		}
	}
}
