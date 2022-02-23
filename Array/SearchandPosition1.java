package ArrayExample;

import java.util.Scanner;

public class SearchandPosition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int search,  arr[],n,i;
		boolean f=false;
		
		System.out.print("\nEnter Size of the array:");
		 n = sc.nextInt();
		
		arr=new int[n];
	
		
		System.out.print("\nEnter "+ n +" array:");
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}//for
		
		System.out.print("\nElements in array are: ");
		for(int k:arr)
		{
			System.out.print("\n"+k);
		}//for
		
		//search
		System.out.print("\nElement to search in array: ");
		search=sc.nextInt();
		
		for(i=0; i<n; i++)
		{
			if(arr[i]==search)
			{
				f=true;
				break;
			}//if
		}//for
		
		if(f==true)
		{
			System.out.println("\nElement "+search+" present at "+(i+1)+" position.");
		}
		else
		{
			System.out.println("\nElement is not present array.");
		}
	}

}
/*
 * output
 * nter Size of the array:5

Enter 5 array:8
6
9
3
5

Elements in array are: 
8
6
9
3
5
Element to search in array: 9

Element 9 present at 3 position.
*/
