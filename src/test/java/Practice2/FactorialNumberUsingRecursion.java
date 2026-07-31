package Practice2;

public class FactorialNumberUsingRecursion {

	public static void main(String[] args) {
		int no = 5;

		long result = factorial(no);

		System.out.println("Factorial of " + no + " is: " + result);
	}

	public static long factorial(int no) {

		// Base condition
		if (no == 0 || no == 1) {
			return 1;
		}

		// Recursive call
		return no * factorial(no - 1);
		
		/*
		 * factorial(5)

		return 5 × factorial(4)
		return 5 × (4 × factorial(3))
		return 5 × (4 × 3 × factorial(2))
		return 5 × (4 × 3 × 2 × factorial(1))
		return 5 × 4 × 3 × 2 × 1
		return 120
		 * 
		 * 
		 * 
		 * 
		 * */
	}
}
