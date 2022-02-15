package BasicJavaProgramming;

public class BoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		Integer wrap=new Integer(a);//boxing
		
		Integer a2=67;//autoboxing
		System.out.println(wrap+ " " + a2);
		Integer a3=Integer.valueOf(a);
		System.out.println(a3);
		}

}

/*
output
50 67
50
*/