package AutomationTesting;

import java.util.ArrayList;
import java.util.HashSet;

public class ArraylistandHashsettoremoveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> array = new ArrayList<String>();
		array.add("Selenium");
		array.add("Test");
		array.add("QTP");
		array.add("Test");
		array.add("Testing");
		
		System.out.println(array);
		HashSet <String> set = new HashSet <String>();
		set.addAll(array);
		array.clear();
		
		System.out.println(set);
		
		
	}

}
