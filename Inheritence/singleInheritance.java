package inheritanceExample;
class Bank
{
	String Bank_name;
	int x=10;
	public Bank(String Bank_name)
	{
		this.Bank_name=Bank_name;
	}//Bank Constructor
	
	public int interest()
	{
		return 8;
	}
	
}//bank

class sbi1 extends Bank
{
	int x=100;
	public sbi1(String Bank_name)
	{
		super(Bank_name);//call parent class constructor 
		
	}//sbi Constructor
	
	void display()
	{
		int x=200; 
		System.out.println("Bank Name :"+Bank_name);
		System.out.println("display:"+x);
		System.out.println("child:"+this.x);
		System.out.println("parent:"+super.x);
	}//display
}//child class
public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sbi1 s = new sbi1(" State bank of india");
		
		s.display();
		System.out.print(s.interest());
	}

}

/*
 * output
 * Bank Name : State bank of india
display:200
child:100
parent:10
8
*/
