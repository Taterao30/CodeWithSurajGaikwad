package Arrays_Programs;

public class Program_21_UnionOfArrays {

	public static void main(String[] args) {

		int[] first = { 10, 20, 30, 40 };
		int[] second = { 30, 40, 50, 60 };

		int[] union = new int[first.length + second.length];
		int index = 0;

		for (int i = 0; i < first.length; i++) {

			boolean duplicate = false;

			for (int j = 0; j < index; j++) {
				if (first[i] == union[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				union[index] = first[i];
				index++;
			}
		}

		for (int i = 0; i < second.length; i++) {

			boolean duplicate = false;

			for (int j = 0; j < index; j++) {
				if (second[i] == union[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				union[index] = second[i];
				index++;
			}
		}

		System.out.println("Union of two arrays:");

		for (int i = 0; i < index; i++) {
			System.out.print(union[i] + " ");
		}
	}

}
