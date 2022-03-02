package ExpreationHandling;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		//ArithmeticException
		System.out.println("Enter 1st value");
		a=sc.nextInt();

		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
				//or
			System.out.println("Exception occurs");
				//or
			e.printStackTrace();
		}

		try
		{
			int arr[]=new int[5];
			arr[10]=90;//exception occur
			System.out.println("value:"+arr[1]);
	
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
			
		}
		
		System.out.println("end of code");
		System.out.println("inside code");
	}

}
/*
output
Enter 1st value
10
Enter 2nd value
2
5
end of code
inside code
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at ExpreationHandling.ExceptionDemo1.main(ExceptionDemo1.java:37)
*/