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