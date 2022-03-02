package ExpreationHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10,b=0;
					System.out.println(a/b);
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handald"+e);
		}
		System.out.println("end of code");
		System.out.println("inside code");
	}

}
/*
output
Exception handaldjava.lang.ArithmeticException: / by zero
end of code
inside code
*/