package Practice2;

import java.util.Arrays;

public class ShiftAllZerotoLeft {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 3, 0, 1, 0 };

		int[] newArr = new int[arr.length];
		int count=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[count] = arr[i];
				count++;
			}
			
		}
		System.out.println(Arrays.toString(newArr));
		
		
		

	}

}
