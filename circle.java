import java.util.*;
class circle
{
	public static void main(String args[])
{
	double radius, circum, aoc;
	double pi=3.14;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter redius of circle:-");
radius=sc.nextDouble();
circum=2*pi*radius;
aoc=pi*radius*radius;
System.out.println("Circumference of circle is:-"+circum);
System.out.println("Area of circle is:-"+aoc);

}
}

/*
output:-
C:\Users\Rashmi>cd Desktop

C:\Users\Rashmi\Desktop>cd javaT

C:\Users\Rashmi\Desktop\javaT>javac circle.java

C:\Users\Rashmi\Desktop\javaT>java circle
Enter redius of circle:-
5
Circumference of circle is:-31.400000000000002
Area of circle is:-78.5
*/