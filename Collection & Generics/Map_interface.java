
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Map_interface {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();//here hashMap also don't do the sequence
		map.put("name","Masum");
		map.put("monthly_pay","zero");
		map.put("company","Frustation_Company");
		map.put("name","Abul");
		//but how do i print the whole thing??
		System.out.println(map);
		//Okay now i want to print one-by-one
		System.out.println(map.get("name"));
		System.out.println(map.get("company"));
		System.out.println(map.get("monthly_pay"));
		//but if any key is not available , then it will print null
		//So,to avoid this here
		Set<String> keys = map.keySet();
		for( String key : keys)
		{
			System.out.println(key + " <---> " + map.get(key));
		}
		System.out.println("where is masum?");
		System.out.println("cause in map,we can repeat values but we can not repeat keys");
		System.out.println("wait a minute...");
		System.out.println("Hashmap don't synchronized but HashTable do it");
		
	}
}
