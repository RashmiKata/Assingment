import java.util.*;
class perfectNumber
{
	public static void main(String args[])
	{
		int n,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}

/*
output

C:\Users\Rashmi\Desktop\javaT>java perfectNumber
Enter number:
86
6
28

C:\Users\Rashmi\Desktop\javaT>java perfectNumber
Enter number:
564321
6
28
496
8128

*/