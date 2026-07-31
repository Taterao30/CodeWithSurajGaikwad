package Arrays_Programs;

public class Program_27_EvenIndexElements {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Elements present at even indexes:");

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				System.out.println("Index " + i + " = " + arr[i]);
			}
		}
	}

}
