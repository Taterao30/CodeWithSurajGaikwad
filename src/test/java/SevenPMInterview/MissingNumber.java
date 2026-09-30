package SevenPMInterview;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;

        int expectedResult = n * (n + 1) / 2;

        int actualResult = 0;

        for (int i = 0; i < arr.length; i++) {
            actualResult = actualResult + arr[i];
        }

        int missingNumber = expectedResult - actualResult;

        System.out.println("Missing number = " + missingNumber);
    }
}