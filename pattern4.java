package BasicJavaProgramming;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)//for(j=i; j>=1; j--)
			{
				System.out.print(+j);
			}
			System.out.println();
		}
	}

}
/*
output
1
12
123
1234
12345
*/