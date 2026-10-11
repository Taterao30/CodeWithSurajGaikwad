package tutorial15;

import java.util.*;

public class RemoveDuplicateWordFromTheString {

    public static void main(String[] args) {

        String str = "java is super java is great java is flexible";

        String[] str1 = str.split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        for (String word : str1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }
}