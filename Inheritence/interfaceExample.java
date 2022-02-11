package inheritanceExample;

interface demo{
	void method1();
	void method2();
}
interface demo1{
	void method3();
}
class XYZ implements demo,demo1{
	public void method1() {
		System.out.println("Impimentation of method 1");
	}
	
	public void method2() {
		System.out.println("Impimentation of method 2");
	}
	@Override
	public void method3() {
		System.out.println("Impimentation of method 3");
	}
}
public class interfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj=new XYZ();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}

/*
output
Impimentation of method 1
Impimentation of method 2
Impimentation of method 3

*/