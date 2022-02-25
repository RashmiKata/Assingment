package collectionFremwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set =new HashSet<String>();
		set.add("om");
		set.add("lalit");
		set.add("jyesh");
		set.add("bhavesh");
		set.add("bhakti");
		set.add(null);
		
		System.out.println(set+"\n");
		
		//remove
		set.remove("bhavesh");
		System.out.println(set+"\n");
		
		//convert hashset to an array
		String [] arr=new String[set.size()];
		set.toArray(arr);
		
		for(String s:arr)
		{	
			System.out.println(s+"\n");
		}
		
		
		//LINKEDHASHSET
		LinkedHashSet<String> set1 =new LinkedHashSet<String>();
		set1.add("om");
		set1.add("lalit");
		set1.add("jyesh");
		set1.add("bhavesh");
		set1.add("bhakti");
		set1.add(null);
		
		System.out.println("In LinkedHashSet"+set1+"\n");
		
		
		//LINKEDHASHSET
				TreeSet<String> set2 =new TreeSet<String>();
				set2.add("om");
				set2.add("lalit");
				set2.add("jyesh");
				set2.add("bhavesh");
				set2.add("bhakti");
								
				System.out.println("In TreeSet"+set2+"\n");
	}

}
/*
output
[null, jyesh, bhavesh, bhakti, lalit, om]

[null, jyesh, bhakti, lalit, om]

null

jyesh

bhakti

lalit

om

In LinkedHashSet[om, lalit, jyesh, bhavesh, bhakti, null]

In TreeSet[bhakti, bhavesh, jyesh, lalit, om]
*/