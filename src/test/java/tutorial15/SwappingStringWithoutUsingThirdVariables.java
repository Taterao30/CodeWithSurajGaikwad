package tutorial15;

public class SwappingStringWithoutUsingThirdVariables {

	public static void main(String[] args) {

		String a = "Taterao";
		String b = "Ram";

		a = a + b;

		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println(b);
		System.out.println(a);

	}

}
