package Practice5;

public class Demo1 {

	public static void main(String[] args) {

//		String amount = "iphone$500";
//
//		String numericValue = amount.replaceAll("\\D", "");
//		int price = Integer.parseInt(numericValue);
//
//		System.out.println(price); // 500
//		System.out.println(price + 100); // 600

//		String value = "1,50,000";
//
//		String cleanedValue = value.replaceAll(",", "");
//		int amount = Integer.parseInt(cleanedValue);
//
//		System.out.println(amount); // 150000

		String value = "Balance: -500";

		String cleanedValue = value.replaceAll("[^0-9-]", "");
		int balance = Integer.parseInt(cleanedValue);

		System.out.println(balance); // -500
	}

}
