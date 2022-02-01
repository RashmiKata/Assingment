package BasicProgram;

import java.util.Scanner;

public class countDigitNumber {

	public static void main(String[] args) { 
		int i=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:-");
		num=sc.nextInt();
		for(;num!=0;++i)
		{
		num/=10;//short hand opraterr
		}
	
		System.out.println("number of digite is:- "+i);
	}

}	

/*
 * output
 * Enter number:-
36778
number of digite is:- 5
*/