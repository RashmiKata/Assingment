package BasicJavaProgramming;

public class UnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in=new Integer(23);// Integer in =integer.valueof(23)
		
		int i=in;//auto unboxing
		System.out.println(i);
		Double d=new Double(45.6);
		double con=d;
		System.out.println(con);
		Character ch=Character.valueOf('a');
		char c=ch;
		System.out.println(c);
	
	}

}
/*
output
23
45.6
a
*/