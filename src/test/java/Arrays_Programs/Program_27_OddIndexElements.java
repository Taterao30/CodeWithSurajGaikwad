package Arrays_Programs;

public class Program_27_OddIndexElements {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Elements present at odd indexes:");

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println("Index " + i + " = " + arr[i]);
		}
	}

}
