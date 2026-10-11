package October_2026_Programms;

public class SubString {

	public static void main(String[] args) {

		String str = "punepunepune";
		int count = 1;

		while (str.startsWith("pune")) {
			System.out.println("pune :" + count++);

			str = str.substring(4);

		}
	}

}
