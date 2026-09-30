package SevenPMInterview;

public class Prime {

	public static void main(String[] args) {

		int no = 7;
		boolean flag = false;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = true;
				break;

			}
		}
		if (flag == false) {
			System.out.println(no + "Is prime");
		} else {
			System.out.println(no + " Is not prime");
		}

	}

}
