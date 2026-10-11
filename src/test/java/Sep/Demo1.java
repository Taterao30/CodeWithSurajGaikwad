package Sep;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String str="I like Pune. It is nice pune and also good punePunepune";
		
		
		
		String str1[]=str.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String word:str1)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
	}

}
