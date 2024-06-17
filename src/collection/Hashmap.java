package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {

		Map<Integer, String>data = new HashMap<Integer, String>();
		data.put(25, "Selenium");
		data.put(35, "IDE");
		data.put(45,  "WebDriver");
		
		
		System.out.println(data.size());
		System.out.println(data.get(25));
		
		//By using FOR EACH
		
		data.forEach((K, V) -> System.out.println("Print K as Key: "+ K + "Print the V as Value: "+V));
		
		
		
		
		
	}

}
