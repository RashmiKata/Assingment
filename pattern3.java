package BasicJavaProgramming;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k;
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j<5; j++)//for(j=i; j>=1; j--)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
  Output
    *
   **
  ***
 ****
*****
 */
