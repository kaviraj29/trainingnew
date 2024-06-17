package collection;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {

		
		Set<String>data = new java.util.HashSet<String>();
		data.add("Selenium");
		data.add("IDE");
		data.add("Webdriver");
		data.add("Grid");
		
		
		//print the value only in set
		//cant print in order
		//individual datas cant be printed or called by index value
		//To method we can use FOR EACH & ITERATOR
		
		
		System.out.println(data.size());
		
		//BY Using For each
		
		for (String str : data) {
			System.out.println(str);
			
		}
		
		//By using Iterator
		
		Iterator<String>it = data.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
