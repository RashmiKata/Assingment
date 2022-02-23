package ArrayExample;

import java.util.Scanner;

public class mergeArrayOneDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =  new Scanner(System.in);
		
		int i, k=5;
		
		int first[]=new int[5];
		int second[]=new int[5];
		int result[]=new int[10];
		
		System.out.print("First Array");
		for(i=0; i<5; i++)
		{
			first[i]=sc.nextInt();
		}
		
		System.out.print("Second Array");
		for(i=0; i<5; i++)
		{
			second[i]=sc.nextInt();
		}
		
		System.out.print("Result Array ");
		for(i=0; i<5; i++)
		{
			result[i]=first[i];
			
			
		}
		
		for(i=0; i<5; i++)
		{
			result[k]=second[i];
			k++;
			
		}
	
		
		for(i=0;i<10;i++ )
		{
			System.out.print(result[i]+" ");
		}
	}

}

/*
output
First Array
56
98
90
56
43
Second Array
9
6
4
7
2
Result Array 56 98 90 56 43 9 6 4 7 2
*/