package ArrayExample;

import java.util.Scanner;

public class MultipicationOfTwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int result[][]=new int[3][3];
		
		int i=0, j=0, k=0;
		
		//intializing b array
		System.out.println("Enter elements in a array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}	
			
		}//for a
		
		System.out.println("Elements in 'a'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}//elements in a
		
		//intializing b array
		System.out.println("Enter elements in b array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				b[i][j]=sc.nextInt();
			}	
			
		}//for b
		
		System.out.println("Elements in 'b'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}//elements in b
		
		
		//Multiplication of Array
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				for(k=0; k<3; k++)
				{
					result[i][j] = a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of Array");
		
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
3
6
8
9
5
8
4
9
2
Elements in 'a'=
3 6 8 
9 5 8 
4 9 2 
Enter elements in b array.
6
9
8
7
3
2
1
7
9
Elements in 'b'=
6 9 8 
7 3 2 
1 7 9 
Multiplication of Array
8 56 72 
8 56 72 
2 14 18 
*/
