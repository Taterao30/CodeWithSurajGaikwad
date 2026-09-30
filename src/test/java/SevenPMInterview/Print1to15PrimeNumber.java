package SevenPMInterview;

public class Print1to15PrimeNumber {
	public static void main(String[] args) {

		for (int i = 2; i <= 15; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					flag = true;
				}
			}
			if (flag == false) {
				System.out.println(i);

			}
		}
	}

}
