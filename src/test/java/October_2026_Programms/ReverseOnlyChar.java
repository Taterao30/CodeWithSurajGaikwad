package October_2026_Programms;

public class ReverseOnlyChar {

	public static void main(String[] args) {

		String str = "suraj10gaikwad20";

		char[] ch = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (!Character.isLetter(ch[left])) {
				left++;
			}

			else if (!Character.isLetter(ch[right])) {
				right--;
			}

			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;

				left++;
				right--;
			}
		}

		System.out.println(new String(ch));
	}
}
//We use left and right pointers to reverse characters from both ends of the string.
//1. left = 0 → Points to the first character.
//2. right = str.length() - 1 → Points to the last character.
//3. We skip digits and swap letters from both ends.
//4. After swapping, left++ moves forward and right-- moves backward.
