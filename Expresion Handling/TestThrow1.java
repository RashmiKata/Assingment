package ExpreationHandling;

import java.io.IOException;

class Mm
{  
	 void method()throws IOException
	 {  
		 System.out.println("device operation performed");  
	 }  
}  

public class TestThrow1 {

	public static void main(String[] args)throws IOException {
	
	     Mm m=new Mm();  
	     m.method();  
	  
	    System.out.println("normal flow...");  

	}

}
/*
output
device operation performed
normal flow...
*/