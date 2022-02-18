package ArrayExample;

import java.util.Scanner;

public class SearchAndPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
		if(a[i]==n) {
			System.out.println("Element "+n+" found at "+i+" position");
			//flag=1;
			break;
		}
		else {
			System.out.println("Element "+n+" not found");
			}
		}

	}
}
/*output
 * Enter number of element array:
5
Enter element:
1
2
3
4
5
Enter the element you want to search:
4
Element 4 not found
Element 4 not found
Element 4 not found
Element 4 found at 3 position
*/
