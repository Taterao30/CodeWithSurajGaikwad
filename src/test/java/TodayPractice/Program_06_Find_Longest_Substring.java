package TodayPractice;


	public class Program_06_Find_Longest_Substring {

	    public static void main(String[] args) {

	        String str = "abcabcbb";

	        String maxSub = "";

	        for (int i = 0; i < str.length(); i++) {

	            String sub = "";

	            for (int j = i; j < str.length(); j++) {

	                if (sub.indexOf(str.charAt(j)) != -1) {
	                    break;
	                }

	                sub = sub + str.charAt(j);

	                // Compare current substring with maximum
	                if (sub.length() > maxSub.length()) {
	                    maxSub = sub;
	                }
	            }
	        }

	        System.out.println("Maximum substring: " + maxSub);
	        System.out.println("Length: " + maxSub.length());
	    }
	}