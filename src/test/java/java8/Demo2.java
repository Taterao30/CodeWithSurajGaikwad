package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

sealed class Demo2 permits Demo3, Demo4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 5);

		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

		for (int number : list) {
			if (!set1.contains(number)) {
				set1.add(number);
			}
		}

		Iterator<Integer> iterator = set1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

// Only this class can extend Demo2
final class Demo3 extends Demo2 {

}

final class Demo4 extends Demo2 {

}
