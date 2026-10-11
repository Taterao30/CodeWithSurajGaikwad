package October_2026_Programms;

public class SwappingStringWithoutThirdVariable {

	public static void main(String[] args) {

		String s1 = "Taterao";
		String s2 = "Ram";

		// TateraoRam

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		System.out.println(s1.substring(0, 7));

		s1 = s1.substring(s2.length());

//		System.out.println(s1);
//		System.out.println(s2);
	}

}
