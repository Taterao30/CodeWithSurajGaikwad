package Practice5;

public class CheckBothArraysAreEquals {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 4 };

		boolean flag = true;

		if (a.length != b.length) {
			flag = false;
		} else {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					flag = false;
					break;
				}

			}
		}
		if (flag == true) {
			System.out.println("Array's are equals");
		} else {
			System.out.println("Arrays are not an equals");
		}
	}

}
