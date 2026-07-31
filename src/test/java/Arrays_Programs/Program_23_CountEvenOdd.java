package Arrays_Programs;

public class Program_23_CountEvenOdd {
	

		public static void main(String[] args) {

			int[] arr = { 10, 15, 20, 25, 30, 35 };

			int evenCount = 0;
			int oddCount = 0;

			for (int number : arr) {

				if (number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}

			System.out.println("Even numbers count: " + evenCount);
			System.out.println("Odd numbers count: " + oddCount);
		}
	}

