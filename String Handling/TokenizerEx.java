package stringHandlingAndRegularEx;

import java.util.StringTokenizer;

public class TokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Welcome, to, java, world"," ");
		
		while(st.hasMoreTokens())
		{
			System.out.print("\n"+st.nextToken());
		
			System.out.println(st.nextToken(","));
		
		String s= st.nextToken(",").toUpperCase();	//uppercase
		System.out.println(s);
	    
		
	
		while(st.hasMoreElements())
		{
			System.out.print("\n"+st.nextElement());
		}
		
		System.out.print("\nTotal count of token:"+st.countTokens());
	
	}

}
}
/*
output
Welcome, to
JAVA

world
Total count of token:0
*/