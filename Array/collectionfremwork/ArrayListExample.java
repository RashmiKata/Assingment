package collectionFremwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare List
				ArrayList<Integer> list =new ArrayList<Integer>();//integer
				ArrayList<String> list2 =new ArrayList<String>();
				
				System.out.print("Insert element in list");
				list.add(10);
				list.add(12);
				list.add(12);
				list.add(13);
				list.add(14);
				
				System.out.println(list);
				
				System.out.println("Size of list");
				System.out.println(list.size()+"\n");
				
				list.add(15);
				list.add(16);
				
				System.out.println("Size of list after adding 2 elements");
				System.out.println(list.size());
				
				//Add at specific position
				System.out.println("Add element at specific position in list");
				list.add(2,5); 
				System.out.println(list);
				
				//Change element
				System.out.println("Change the element at specific position in list");
				list.set(3,17);
				System.out.println(list);
				
				//Remove Element

				System.out.println("Remove element at position in list");
				list.remove(3);
				System.out.println(list);
				
				System.out.println("Print element one aft the other.");
				for(Integer i:list)
				{
					System.out.println(i);
				}
				
				//for loop
				System.out.println("Display using for loop");
				for(int i=0; i<list.size(); i++)
				{
					System.out.println(list.get(i));
				}
				
				System.out.println("\n");
				
				//while loop
				System.out.println("Display using while loop");
				int j=0;
				while(j<list.size())
				{
					System.out.println(list.get(j));
					j++;
				}
				
				
				
				//iterator
				System.out.println("Display using iterator");
				Iterator itr=list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
								
				//Sort list Accending
				System.out.println("Sort List Accending Order");
				Collections.sort(list);
				System.out.println("After Sorting Values Accending Order:");
				for(Integer i:list)
				{
					System.out.println(i);
				}
				
				System.out.println();
				
				//Sort list Decending
				System.out.println("Sort List Decending order");
				Collections.sort(list,Collections.reverseOrder());
				System.out.println("After Sorting Values Decending order:");
				for(Integer i:list)
				{
					System.out.println(i);
				}
				
								
				//String List
				System.out.println("String list");
				list2.add("A");
				list2.add("F");
				list2.add("E");
				list2.add("D");
				list2.add("C");
				list2.add("B");
				System.out.println(list2);
				
				System.out.println("list2 size");
				System.out.println(list2.size());
				
				//Add at specific position
				System.out.println("Add element at specific position in list");
				list2.add(3,"Q");
				System.out.println(list2);		
		
	}
	

}
/*
output
Insert element in list[10, 12, 12, 13, 14]
Size of list
5

Size of list after adding 2 elements
7
Add element at specific position in list
[10, 12, 5, 12, 13, 14, 15, 16]
Change the element at specific position in list
[10, 12, 5, 17, 13, 14, 15, 16]
Remove element at position in list
[10, 12, 5, 13, 14, 15, 16]
Print element one aft the other.
10
12
5
13
14
15
16
Display using for loop
10
12
5
13
14
15
16


Display using while loop
10
12
5
13
14
15
16
Display using iterator
10
12
5
13
14
15
16
Sort List Accending Order
After Sorting Values Accending Order:
5
10
12
13
14
15
16

Sort List Decending order
After Sorting Values Decending order:
16
15
14
13
12
10
5
String list
[A, F, E, D, C, B]
list2 size
6
Add element at specific position in list
[A, F, E, Q, D, C, B]

*/