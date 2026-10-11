
package October_2026_Programms;

public class CountVowelsAndConsonentsFromTheString {

    public static void main(String[] args) {

        String str = "ahetidou";

        int vowels = 0;
        int consonents = 0;

        for (char c : str.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonents++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonents);
    }
}



//
//        String str = "ahetidou";
//
//        int vowels = 0;
//        int consonents = 0;
//
//        for (char c : str.toCharArray()) {
//
//            if (c == 'a' || c == 'e' || c == 'i'
//                    || c == 'o' || c == 'u') {
//
//                vowels++;
//
//            } else {
//                consonents++;
//            }
//        }
//
//        System.out.println("Vowels: " + vowels);
//        System.out.println("Consonants: " + consonents);
//    }
//}
//
