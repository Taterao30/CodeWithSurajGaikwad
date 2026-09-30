package August;

public class RemoveDuplicateNumbers {

    public static void main(String[] args) {

        int[] nums = {10, 20, 10, 30, 20, 40, 30,100};

        int[] arr = new int[200];

        for (int i = 0; i < nums.length; i++) {

            if (arr[nums[i]] == 0) {

                System.out.print(nums[i] + " ");

                arr[nums[i]] = 1;
            }
        }
    }
}