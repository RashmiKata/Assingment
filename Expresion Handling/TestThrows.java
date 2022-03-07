package ExpreationHandling;

import java.io.IOException;

	class M
	{  
			void method()throws IOException
			{  
				throw new IOException("device error");  
			}  
	}  

	public class TestThrows {

		public static void main(String[] args) {
		    try
		    {  
			     M m=new M();  
			     m.method();  
		    }
		    catch(Exception e)
		    {
		    	System.out.println("exception handled");
		    }     
			  
			   System.out.println("normal flow...");  
		}

}
/*
	output
	exception handled
	normal flow...
*/