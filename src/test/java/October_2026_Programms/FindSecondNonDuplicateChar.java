
package October_2026_Programms;

public class FindSecondNonDuplicateChar {

	public static void main(String[] args) {

		String str = "automation";
		int count = 0;

		for (char c : str.toCharArray()) {

			if (str.indexOf(c) == str.lastIndexOf(c)) {
				// if(0==5)--false
				// if(1== 1)--true

				count++;
				//If the the condition is true for if block
				//then count will be incremented by 1
				//so if the count become 2 then if block will execute
				//Note:Accourding to the requirement we can change the 
				//value of count
				if (count == 2) {
					System.out.println("Second non-duplicate: " + c);
					break;
				}
			}
		}
	}
}
