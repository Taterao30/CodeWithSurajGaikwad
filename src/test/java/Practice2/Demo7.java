package Practice2;

public class Demo7 {

	public static void main(String[] args) {
		int no = 5;

		for (int i = 0; i < no; i++) {
			System.out.print(getData(i)+" ");
		}
	}

	public static int getData(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}

		return getData(i - 1) + getData(i - 2);
	}

}
