package newjavapractice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		String names[] = {"Java","C","Java","C","Python","Ruby","C#", "Go" };
		
		
		//Using HashSet 
		//Time complexcity is O(n)
		//Set conatians unique values
		
		Set<String>store = new HashSet<String>();
		
		for(String name:names) {
			
			if(store.add(name)==false) {
				
				System.out.println("The duplicates are::"+ name);
			}
			
		}
		//Using HashMap 
		//Map stores key value pairs
		//Allows Duplicate values.
		
		
		System.out.println("********");
		
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			
			Integer count = storeMap.get(name);
			if(count == null) {
				
				storeMap.put(name,1);
			}
			else {
				
				storeMap.put(name, ++count);
			}
			
			
		}
		//Get the values from this HashMap:
		
		
	Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
	for(Entry<String, Integer> entry : entrySet) {
		
		if(entry.getValue()>1) {
			
			System.out.println("Duplicate element is::"+ entry.getKey());
		}
	}
		
		
		
	
	}

}
