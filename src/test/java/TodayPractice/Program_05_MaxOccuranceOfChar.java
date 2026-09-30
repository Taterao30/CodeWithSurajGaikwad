package TodayPractice;

public class Program_05_MaxOccuranceOfChar {

    public static void main(String[] args) {

        String str = "programming";

        int arr[] = new int[126];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int max = 0;
        char maxChar = ' ';

        // Find maximum
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxChar = (char) i;
            }
        }

        System.out.println(maxChar + " = " + max);
    }
}