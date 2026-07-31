package Practice2;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int no = 371;
		int leng = 0;
		int temp1 = no;

		while (temp1 != 0) {
			leng = leng + 1;
			temp1 = temp1 / 10;

		}

		int temp2 = no;

		int rem = 0;
		int sum = 0;
		while (temp2 != 0) {
			rem = temp2 % 10;
			// System.out.println(rem);
			temp2 = temp2 / 10;

			int mul = 1;

			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;
			}
			sum = sum + mul;
		}
		System.out.println(sum);

	}

}
