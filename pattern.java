import java.util.*;
class pattern
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
	}
}
/*
output

C:\Users\Rashmi\Desktop\javaT>javac pattern.java

C:\Users\Rashmi\Desktop\javaT>java pattern
*
**
***
****
*****


*/