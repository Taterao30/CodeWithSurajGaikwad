package Practice2;

public class RemoveWhiteSpacesFromTheString {

	public static void main(String[] args) {

		String str = "Taterao Ram Gaikwad";

		String str1 = str.replaceAll("\\s+", "").trim();
		System.out.println(str1);

	}
}
