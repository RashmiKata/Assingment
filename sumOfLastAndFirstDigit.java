package BasicProgram;

import java.util.Scanner;

public class sumOfLastAndFirstDigit {

	public static void main(String[] args) {
	
		int sum,num,firstDigit,lastDigit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number-");
		num=sc.nextInt();
				
				lastDigit=num%10;
				System.out.println("last Digit- "+lastDigit);
				for(;num>=10;)
				{
					num=num/10;
				}
				firstDigit=num;
				System.out.println("first digite-" +firstDigit);
				System.out.println("sum of first digit and last digit- "+(firstDigit+lastDigit));
				}
		

	}


/*
output
Enter number-
5673
last Digit- 3
first digite-5
sum of first digit and last digit- 8

*/