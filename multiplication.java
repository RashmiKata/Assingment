package BasicProgram;
import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
for (i=1;i<=10;i++)
{
	System.out.println(num+"*"+i+"="+num*i);
}

	}

}

/*
output
Enter number
3
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30
*/