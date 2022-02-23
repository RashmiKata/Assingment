package ArrayExample;

import java.util.Scanner;

public class AdditionofTwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int result[][]=new int[3][3];
		
		int i=0, j=0;
		
		//intializing b array
		System.out.println("Enter elements in a array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}	
			
		}
		
		System.out.println("Elements in 'a'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//intializing b array
		System.out.println("Enter elements in b array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				b[i][j]=sc.nextInt();
			}	
			
		}
		
		System.out.println("Elements in 'b'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//Addition of array
		System.out.println("Addition of a and b array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				result[i][j]=a[i][j]+b[i][j];
			}	
		}
		
		System.out.println("Result of 'a' and 'b'");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
/*
 * output
 * Enter elements in a array.
3 5 6
4 2 1
7 5 4
Elements in 'a'=
3 5 6 
4 2 1 
7 5 4 
Enter elements in b array.
5 7 3
9 6 7
5 5 5
Elements in 'b'=
5 7 3 
9 6 7 
5 5 5 
Addition of a and b array.
Result of 'a' and 'b'
8 12 9 
13 8 8 
12 10 9
*/
