package tutorial1;

public class SumOfNumbers {

    public static void main(String[] args) {

        String str = "t10ate3ra2o1";

        int sum = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                number = number * 10 + Character.getNumericValue(ch);

            } else {

                sum = sum + number;
                number = 0;
            }
        }

        // Add the last number
        sum = sum + number;

        System.out.println(sum);
    }
}