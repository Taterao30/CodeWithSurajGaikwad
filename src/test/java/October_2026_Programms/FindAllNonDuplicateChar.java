
package October_2026_Programms;

public class FindAllNonDuplicateChar {

    public static void main(String[] args) {

        String str = "abbcddeffgh";

        for (char c : str.toCharArray()) {

            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c);
            }
        }
    }
}
