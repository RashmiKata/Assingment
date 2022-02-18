package ArrayExample;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		arr=new int[size];
		
		System.out.println("Enter " +size+"element in an array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Element of an aaray are:");
		for(int i:arr) {
			System.out.println(i);
		}
		
		//maximum
		int max=arr[0];
		for(int i=1;i<size;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum value is:"+max);
		
		
		//minimum
		int min=arr[0];
		for(int i=0;i<size;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum value is:"+min);
	}

}

/*output
Enter size of an array
5
Enter 5element in an array:
5
2
7
6
9
Element of an aaray are:
5
2
7
6
9
Maximum value is:9
Minimum value is:2
*/