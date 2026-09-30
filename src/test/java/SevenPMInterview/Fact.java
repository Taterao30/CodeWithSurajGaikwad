package SevenPMInterview;

public class Fact {

	public static int fact(int num) {
		if (num == 1) {
			return 1;
		}

		return num = num * fact(num - 1);
	}

	public static void main(String[] args) {

		int result = fact(5);
		System.out.println(result);

	}

}