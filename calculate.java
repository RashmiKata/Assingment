/*WAP to accept two no from user and calculate add, sub, mul, div, mod*/
import java.util.*;
class calculate
{
	public static void main(String args[])
	{
		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The Addition is:-"+sum);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1-num2;
		System.out.println("The Subtraction is:-"+sum);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1*num2;
		System.out.println("The Multiplication is:-"+sum);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1/num2;
		System.out.println("The Divition is:-"+sum);
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		sum=num1%num2;
		System.out.println("The mod is:-"+sum);
	}
}