package tutorial15;

public class ReplaceAWithSpec {

	public static void main(String[] args) {

		String str = "amitabhbachan";
		int acount = 0;
		int bcount = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == 'a') {
				acount++;

				for (int j = 1; j <= acount; j++) {
					result = result + "@";
				}
			} else if (c == 'b') {
				bcount++;

				for (int j = 1; j <= bcount; j++) {
					result = result + "#";
				}
			} else {
				result = result + c;
			}

		}
		System.out.println(result);

	}
}
