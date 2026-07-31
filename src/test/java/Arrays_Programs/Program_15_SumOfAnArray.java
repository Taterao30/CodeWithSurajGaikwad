package Arrays_Programs;

public class Program_15_SumOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int number : arr) {
			sum = sum + number;
		}

		System.out.println("Sum of array elements: " + sum);
	}

}
