package collectionFremwork;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList<Integer>llist=new LinkedList<Integer>();
		llist.add(12);
		llist.add(52);
		llist.add(92);
		llist.add(2);
		System.out.println(llist);
		llist.addFirst(10);
		llist.addLast(100);
		
		System.out.println(llist);
		
		llist.add(3,30);
		System.out.println(llist);
		
		int del=llist.removeFirst();
		System.out.println(del);
		System.out.println(llist);
		
		int last=llist.removeLast();
		System.out.println(del);
		System.out.println(llist);
		
		
		System.out.println("Display using for loop");
		for(int i=0;i<llist.size();i++)
		{
			System.out.println(llist.get(i));
		}
		
		//while loop
				System.out.println("Display using while loop");
				int j=0;
				while(j<llist.size())
				{
					System.out.println(llist.get(j));
					j++;
				}
				
			
				
				//iterator
				System.out.println("Display using iterator");
				Iterator itr=llist.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				
				//Sort list Accending
				System.out.println("Sort List Accending Order");
				Collections.sort(llist);
				System.out.println("After Sorting Values Accending Order:");
				for(Integer i:llist)
				{
					System.out.println(i);
				}
				
				
				
				//Sort list Decending
				System.out.println("Sort List Decending order");
				Collections.sort(llist,Collections.reverseOrder());
				System.out.println("After Sorting Values Decending order:");
				for(Integer i:llist)
				{
					System.out.println(i);
				}
				
				
								
				System.out.println(llist);
				
				System.out.println("After First add, Last add, At position add");
				llist.addFirst(10);
				llist.addLast(100);
				llist.add(3,30);
				System.out.println(llist);
				
				
				//remove at position
				int ind = llist.remove(2);
				System.out.println("Removed element at position 2: "+ind);
				System.out.println(llist);
				
				//clear list
				llist.clear();
				System.out.println("After clear list :"+llist);
				
				//string
				LinkedList<String> link =new LinkedList<String>();
				
				link.add("apple");
				link.add("mango");
				link.add("apple");
				System.out.println(link);
				
				int index = link.lastIndexOf("apple");
				System.out.println("Last index of apple "+index);
	}

}

/*
 * output
 * [12, 52, 92, 2]
[10, 12, 52, 92, 2, 100]
[10, 12, 52, 30, 92, 2, 100]
10
[12, 52, 30, 92, 2, 100]
10
[12, 52, 30, 92, 2]
Display using for loop
12
52
30
92
2
Display using while loop
12
52
30
92
2
Display using iterator
12
52
30
92
2
Sort List Accending Order
After Sorting Values Accending Order:
2
12
30
52
92
Sort List Decending order
After Sorting Values Decending order:
92
52
30
12
2
[92, 52, 30, 12, 2]
After First add, Last add, At position add
[10, 92, 52, 30, 30, 12, 2, 100]
Removed element at position 2: 52
[10, 92, 30, 30, 12, 2, 100]
After clear list :[]
[apple, mango, apple]
Last index of apple 2

 */















