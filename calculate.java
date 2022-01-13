/*WAP to accept two no from user and calculate add, sub, mul, div, mod*/
import java.util.*;
class calculate
{
	public static void main(String args[])
	{
		int num1,num2,sum;
		double div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The Addition is:-"+sum);
		sum=num1-num2;
		System.out.println("The Subtraction is:-"+sum);
		sum=num1*num2;
		System.out.println("The Multiplication is:-"+sum);
		div=num1/num2;
		System.out.println("The Divition is:-"+div);
		sum=num1%num2;
		System.out.println("The mod is:-"+sum);
	}
}
/*
output:-
C:\Users\Rashmi>cd Desktop

C:\Users\Rashmi\Desktop>cd javaT

C:\Users\Rashmi\Desktop\javaT>javac calculate.java

C:\Users\Rashmi\Desktop\javaT>java calculate
Enter first number:-
20
Enter second number:-
3
The Addition is:-23
The Subtraction is:-17
The Multiplication is:-60
The Divition is:-6.0
The mod is:-2
*/