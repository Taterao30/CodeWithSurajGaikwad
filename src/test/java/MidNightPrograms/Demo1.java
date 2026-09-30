package MidNightPrograms;

public class Demo1 {

	public static void main(String[] args) {

		String str = "programming";

		String result = "";

		int[] arr = new int[126];

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 0) {
				result = result + str.charAt(i);

				arr[str.charAt(i)] = 1;
			}
		}

		System.out.println(result);

	}

}
