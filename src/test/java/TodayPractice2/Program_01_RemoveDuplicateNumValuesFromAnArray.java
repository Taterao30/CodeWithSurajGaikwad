package TodayPractice2;

public class Program_01_RemoveDuplicateNumValuesFromAnArray {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 10, 30, 20, 40, 30 };

		int[] arr = new int[41];

		for (int i = 0; i < nums.length; i++) {

			if (arr[nums[i]] == 0) {

				System.out.print(nums[i] + " ");

				arr[nums[i]] = 1;
			}
		}
	}
}