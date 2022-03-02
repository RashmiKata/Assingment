package ExpreationHandling;

import java.beans.Expression;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try//external
		{
			System.out.println("Inside external try.");
					
			try //inner
			{
				int arr[]=new int[5];
				arr[1]=6;
				System.out.println(arr[6]);
								
			}
			catch(ArrayIndexOutOfBoundsException ee)
			{
				System.out.println("Exception handle. Inside internal catch"+ee);
			}
			//inner
			
			
			try
			{
				System.out.println("going to devide by zero");
				int d=23/2;
				System.out.println(d);
			}
			catch(ArithmeticException ex)//internal
			{
				System.out.println("Exception handle"+ex);
			}
			
			
		}//external
		catch (Exception e)
		{
			System.out.println("Inside external catch"+e);
			
		}//external
		
		finally
		{
			System.out.println("Finally block always execute.");
		}//finally
	}
}
/*
 output
 Inside external try.
Exception handle. Inside internal catchjava.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
going to devide by zero
11
Finally block always execute.
*/
