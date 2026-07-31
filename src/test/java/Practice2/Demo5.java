package Practice2;

public class Demo5 {

	public static void main(String[] args) {

		int no = 5;

		int resulr = getFact(no);
		System.out.println(resulr);

	}

	public static int getFact(int i) {
		if (i == 0 || i == 1) {
			return 1;
		}

		return i * getFact(i - 1);
	}

}
