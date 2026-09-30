package java8;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

//		Runnable r=()-> System.out.println("Hello");
//		r.run();
//
//		List<String> names = Arrays.asList("Suraj", "Rahul", "Amit");
//
//		names.forEach(name -> System.out.println(name));
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		list.stream().forEach(n->System.out.println(n));
	}

}
