package inheritanceExample;

interface demo_1
{
	void method1(); 
	void method2();
}

interface demo_2 extends demo_1
{
	void method3();

}

class ABC implements demo_2
{
	public void method1()
	{
		System.out.println("In method1");
	}
	
	public void method2()
	{
		System.out.println("In method2");
	}

	public void method3()
	{
		System.out.println("In method3");
	}

}

public class interfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj = new ABC();
		
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
/*
output
In method1
In method2
In method3
*/