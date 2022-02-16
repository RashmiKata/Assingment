package stringHandlingAndRegularEx;

import java.util.Scanner;

public class CountFrequencyusingCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char ch;
		int count = 0;
		String freq;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence to check frequency");
		freq= sc.nextLine();
		
		System.out.println("Enter char to freq count:");
		ch=sc.next().charAt(0);
		for(i=0;i<freq.length();i++) {
			if(freq.charAt(i)==ch) {
				count ++;
			}
		}
		System.out.println("Count of charater:"+count);
	}

}
/*
 * output
 * Enter sentence to check frequency
rashmi katakdound
Enter char to freq count:
a
Count of charater:3
*/
