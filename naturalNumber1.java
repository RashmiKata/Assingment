package BasicProgram;
import java.util.Scanner;
public class naturalNumber {

	public static void main(String[] args) {
		int num,i, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
	
			sum=sum+i;
		}
		System.out.println("sum of natural number from 1 to "+ num + " is = "+sum);
	}

}

/*
output
Enter number
8
sum of natural number from 1 to 8 is = 36
*/