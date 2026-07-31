package Practice2;

public class Demo1 {

	public static void main(String[] args) {

		String str1 = "Taterao";
		String str2 = "Ram";

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);
	}
}
