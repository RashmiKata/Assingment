/*WAP to accept your name, address,persentage,gender,hobbies*/
import java.util.Scanner;
class data
{
	public static void main(String args[])
	{
		String name, address;
		double persentage;
		char gen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:-");
		name=sc.nextLine();
		//name=sc.next();
		System.out.println("Name is ="+name);
		System.out.println("Enter your gender:-");
		gen=sc.nextLine().charAt(0);
		System.out.println("Gender is ="+gen);
		System.out.println("Enter your Address:-");
		address=sc.nextLine();
		System.out.println("Address is ="+address);
		System.out.println("Enter your Persentage:-");
		persentage=sc.nextDouble();
		System.out.println("Persentage is ="+persentage);
	}
}
/*
output:-

C:\Users\Rashmi\Desktop\javaT>javac data.java

C:\Users\Rashmi\Desktop\javaT>java data
Enter your name:-
rashmi katakdound
Name is =rashmi katakdound
Enter your gender:-
female
Gender is =f
Enter your Address:-
lane no 25 shivnerenagar pune 48
Address is =lane no 25 shivnerenagar pune 48
Enter your Persentage:-
79.4
Persentage is =79.4
*/