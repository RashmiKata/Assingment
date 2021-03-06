package BasicJavaProgramming;

import java.util.Scanner;

public class StrongNumber1 
{

	public static int perfect(int num)
	{
		int i=1, sum=0;
		
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		if(perfect(n)==n)
		{	
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+" is not perfect number");
		}
		
	}
}
/*
output
Enter number:
28
28 is perfect number

Enter number:
185
185 is not perfect number
*/