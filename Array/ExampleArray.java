package ArrayExample;

import java.util.Scanner;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[];
		
		int arr1[]=new int[5];
		arr1[0]=5;
		arr1[1]=6;
		arr1[2]=7;
		arr1[3]=8;
		arr1[4]=9;
		
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		//int arr[]=new int[n];
		arr=new int [n];
		
		System.out.println("Enter" + n +  "element in an array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[0]);
		for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
/*output
Enter size of array:
5
Enter5element in an array:
4
7
9
2
5
4
5
6
7
8
9
*/