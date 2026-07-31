package Arrays_Programs;

public class Program_08_TwoArraysAreEquals {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };

		boolean flag = true;

		if (a.length != b.length) {
			flag = false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
				}
			}

		}
		if (flag == true) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equals");
		}

	}
}