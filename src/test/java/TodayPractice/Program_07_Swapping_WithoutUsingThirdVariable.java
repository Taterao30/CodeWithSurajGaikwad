package TodayPractice;

public class Program_07_Swapping_WithoutUsingThirdVariable {

	public static void main(String[] args) {
		String s1 = "Suraj";
		String s2 = "Ram";

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		System.out.println(s1.length() - s2.length());


		System.out.println(s2);

		System.out.println(s1);
	}

}
