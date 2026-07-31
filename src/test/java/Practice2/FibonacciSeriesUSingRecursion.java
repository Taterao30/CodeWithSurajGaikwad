package Practice2;

public class FibonacciSeriesUSingRecursion {

	public static void main(String[] args) {

		int no = 5;

		for (int i = 0; i < no; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int no) {

		// Base condition
		if (no == 0) {
			return 0;
		}

		if (no == 1) {
			return 1;
		}

		// Recursive call
		return fibonacci(no - 1) + fibonacci(no - 2);
	}
}
