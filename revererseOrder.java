import java.util.*;
class revererseOrder
{
	public static void main(String args[])
	{
		int n,reverse=0,reminder=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		n=sc.nextInt();
		while(n!=0)
		{
			reminder=n%10;
			reverse=reverse*10+reminder;
			n=n/10;
		}
		System.out.println("reverse number is:-"+reverse);
	}
}
/*
output
C:\Users\Rashmi\Desktop\javaT>javac revererseOrder.java

C:\Users\Rashmi\Desktop\javaT>java revererseOrder
Enter Number:-
564321
reverse number is:-123465
*/