package BasicJavaProgramming;
import java.util.*;
public class StrongNumber {
public static int fact(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact*=i;
	}
	return fact;
}
void display() {
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,rem,fact,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check strong or not:");
		n=sc.nextInt();
		
		temp=n;
		while(n>0)
		{
			rem=n%10;
			fact=fact(rem);
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+ "is strong number");
		else
			System.out.println(temp+ "is not a strong number");
		}

	}

/*
output
Enter number to check strong or not:
145
145is strong number


Enter number to check strong or not:
897                                       
897is not a strong number
*/