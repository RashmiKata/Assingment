package OOPsExample;

import java.util.Scanner;

public class switchCaseCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
		double div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice 1: Addition\n Choice 2: Substraction\n Choice 3: Multiplication\n "
				+ "Choice 4: Devision");
		System.out.println("********************************************************");
		System.out.println("Enter your choice");
		sum = sc.nextInt();
		System.out.println("Enter first number:-");
		num1=sc.nextInt();
		System.out.println("Enter second number:-");
		num2=sc.nextInt();
		System.out.println("********************************************************");
		switch(sum) {
		case 1:
		sum=num1+num2;
		System.out.println("The Addition is:-"+sum);
		System.out.println("********************************************************");
		break;
		
		case 2:
			sum=num1-num2;
			System.out.println("The Subsraction is:-"+sum);
			System.out.println("********************************************************");
			break;
			
		case 3:
			sum=num1*num2;
			System.out.println("The Multipication is:-"+sum);
			System.out.println("********************************************************");
			break;
			
		case 4:
			sum=num1/num2;
			System.out.println("The Divistion is:-"+sum);
			System.out.println("********************************************************");
			break;
			
			default:System.out.println("Invalid choice");
		}
	}

}
