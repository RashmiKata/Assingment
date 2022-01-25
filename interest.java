import java.util.*;
class interest
{
	public static void main(String args[])
	{
		float p, r, n, interest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal ammount:-");
		p=sc.nextFloat();
		System.out.println("Enter rate of interest:-");
		r=sc.nextFloat();
		System.out.println("Enter time period:-");
		n=sc.nextFloat();
		interest=(p*r*n)/100;
		System.out.println("System interest is:-"+interest);
	}
}

/*
outpot;-

C:\Users\Rashmi\Desktop\javaT>javac interest.java

C:\Users\Rashmi\Desktop\javaT>java interest
Enter principal ammount:-
65000
Enter rate of interest:-
7
Enter time period:-
4
System interest is:-18200.0
*/