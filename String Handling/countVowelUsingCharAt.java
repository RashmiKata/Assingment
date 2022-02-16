package stringHandlingAndRegularEx;

import java.util.Scanner;

public class countVowelUsingCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value;
		int i, count=0;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence to check vowel");
		value = sc.nextLine();
		
		for(i=0; i<value.length(); i++)
		{	
				ch = value.charAt(i);
			
				if((ch=='A'||ch=='a') || (ch=='E' || ch=='e') || (ch=='I' || ch=='i') || (ch=='O' || ch=='o') ||
						(ch=='U' || ch=='u'))
				{
					count++;
					
				}//if	
		}//for
		System.out.println("Noof vowels in string:" +count);

	}
	
}

/*
 * output
 * Enter sentence to check vowel
Rashmi Katakdound
Noof vowels in string:6
*/
