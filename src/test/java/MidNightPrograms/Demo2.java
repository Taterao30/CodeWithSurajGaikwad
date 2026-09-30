package MidNightPrograms;

public class Demo2 {

	public static void main(String[] args) {

		String str = "aabbccddffffffff";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		char c = ' ';
		int maxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				c = (char) i;
			}
		}

		System.out.println(c);
	}

}
