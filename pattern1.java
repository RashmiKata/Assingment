import java.util.*;
class pattern1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=4;i>=0;i--)
		{
			for(j=0;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
ouput

C:\Users\Rashmi\Desktop\javaT>javac pattern1.java

C:\Users\Rashmi\Desktop\javaT>java pattern1
*
**
***
****
*****
****
***
**
*

*/