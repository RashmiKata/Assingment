/*WAP to accept a no from user if no is divisible by 5 then display the cube*/

import java.util.*;
class cube
{
	public static void main(String args[])
	{
		int result, num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr cube number:-");
		num=sc.nextInt();
		if(num%5==0)
		{
			result=(num*num*num);
			System.out.println("cube of number is:-"+result);
		}
		else
		{
			System.out.println("Enter currect number:-");
		}
	}
}
/*
output


C:\Users\Rashmi>cd Desktop

C:\Users\Rashmi\Desktop>cd javaT

C:\Users\Rashmi\Desktop\javaT>javac cube.java

C:\Users\Rashmi\Desktop\javaT>java cube
Enetr cube number:-
5
cube of number is:-125

C:\Users\Rashmi\Desktop\javaT>java cube
Enetr cube number:-
3
Enter currect number:-
*/