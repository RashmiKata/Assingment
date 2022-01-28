package BasicProgram;

import java.util.Scanner;
class ForLoop
{
public static void main(String args[])
{
int i,n;
System.out.println("Entar range to print natural number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(i);
}
}
}
/*
output
Entar range to print natural number
20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/