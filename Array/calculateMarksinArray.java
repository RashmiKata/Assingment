package ArrayExample;

import java.util.Scanner;

public class calculateMarksinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		int arry[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for five subject");
		for(i=0;i<5;i++) {
			arry[i]=sc.nextInt();
			sum=sum+arry[i];
		}
		System.out.println("Sum of five subject marks:" +sum);
	}

}
/*
 * output
 * Enter marks for five subject
70
60
90
79
80
Sum of five subject marks:379
*/
