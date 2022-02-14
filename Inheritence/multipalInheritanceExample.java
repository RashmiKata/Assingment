package inheritanceExample;
interface A
{
	 void Display(); //abstract method
}

interface B extends A
{
	void Display();
	
}

interface C 
{
	void Display();
}
 
class D implements B,C
{
	public void Display()
	{
	System.out.println(" multuple inheritance");
	}

}

public class multipalInheritanceExample {
	public static void main(String[] args) {
		
		D obj = new D();
		obj.Display();
	}

}

