package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {

		java.util.List<String>data = new ArrayList<String>();
		data.add("Selenium");
		data.add("WebDriver");
		data.add("IDE");
		
		
		System.out.println(data.size());
		System.out.println(data.get(2));
		
		
		System.out.println("Printing using the While Loop");
		
		int i=0;
		while(i<data.size())
		{
			System.out.println(data.get(i));
			i++;
		}
		
		System.out.println("Printing using the for Loop");
		
		for(int j=0; j<data.size(); j++)
		{
			System.out.println(data.get(j));
		}
		
		System.out.println("Printing using the for each");
		
		for (String str : data) {
			
			System.out.println(str);
			
		}
		
		System.out.println("Printing using the Iterator");
		
		Iterator<String>it=data.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
		
	}

}
