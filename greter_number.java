/*Accept two numbers from user and find greatest number*/
import java.util.*;
class greter_number
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println("It is gretter number"+n1);
		}
		else
		{
			System.out.println("It is not gretter number");
		}
	}
}
/*
output

C:\Users\Rashmi>cd Desktop

C:\Users\Rashmi\Desktop>cd javaT

C:\Users\Rashmi\Desktop\javaT>javac greter_number.java

C:\Users\Rashmi\Desktop\javaT>java greter_number
Enter two number
21
10
It is gretter number21

C:\Users\Rashmi\Desktop\javaT>java greter_number
Enter two number
34
98
It is not gretter number
*/