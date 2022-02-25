package collectionFremwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(12, "Chitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		
		//Before sorting the values are:
		//Display content sing Iterator
		System.out.println("Before sorting value are:");
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.println("key is:"+mentry.getKey()+"& Value is:");
			System.out.println(mentry.getValue());
		}
		
		//Sorting elements
		Map<Integer,String>map=new TreeMap<Integer,String>(hmap);
		System.out.println();
		System.out.println("After sorting the value are:");
		Set set2=map.entrySet();
		Iterator iterator2=set2.iterator();
		
		while(iterator2.hasNext()) {
			Map.Entry mentry1=(Map.Entry)iterator2.next();
			System.out.println("key is:"+mentry1.getKey()+"& Value is:");
			System.out.println(mentry1.getValue());
		}
		
		//check if paricular value exist in hasmap
		
		boolean val=hmap.containsValue("jeet");
		System.out.println(val);
		boolean val1=hmap.containsValue("Ajeet");
		System.out.println(val1);
		//check if particular key exist in hasmap
		
		boolean key=hmap.containsKey(3);
		System.out.println(key);
		
		//hasmap mpty or not
		System.out.println(hmap.isEmpty());
		
		//copy one hasmap element to another
		HashMap<Integer,String>copyhmap=new HashMap<Integer,String>();
		copyhmap.putAll(hmap);
		System.out.println("copy hashmap contains:"+copyhmap);
	}

}
/*
output
Before sorting value are:
key is:49& Value is:
Ajeet
key is:2& Value is:
Rahul
key is:3& Value is:
Anuj
key is:7& Value is:
Singh
key is:12& Value is:
Chitanya

After sorting the value are:
key is:2& Value is:
Rahul
key is:3& Value is:
Anuj
key is:7& Value is:
Singh
key is:12& Value is:
Chitanya
key is:49& Value is:
Ajeet
false
true
true
false
copy hashmap contains:{49=Ajeet, 2=Rahul, 3=Anuj, 12=Chitanya, 7=Singh}
*/