package stringHandlingAndRegularEx;

public class ComparingStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="rashmi";//imuteble
		String s2="Rashmi";
		System.out.println(s1=s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3=new String("rashmi");//muteble
		String s4=new String("rashmi");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String name="good morning";
		char ch=name.charAt(5);//returns the char value at the 5th index
		System.out.println(ch);
	}

}

/*
 * output
  Rashmi
true
true
false
true
m

 */
