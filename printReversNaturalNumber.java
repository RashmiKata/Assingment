package BasicProgram;
import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
int i,n;
System.out.println("Entar range to print natural reverse number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=n;i>=1;i--)
{
System.out.println(i);
}
}
}
/*
 * output
 * Entar range to print natural reverse number
20
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
*/