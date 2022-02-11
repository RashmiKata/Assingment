package inheritanceExample;
class Bank1
{
	String Bank_name;
	
	public Bank1(String Bank_name)
	{
		this.Bank_name=Bank_name;
	}//Bank Constructor
	
	public int interest()
	{
		return 8;
	}
	
}//bank

class SBI extends Bank
{
	public SBI(String Bank_name)
	{
		
		super(Bank_name);//call parent class constructor 
		
	}//sbi Constructor

	void display()
	{
		int x=200;
		
		System.out.println("Bank Name :"+Bank_name);
		
	}//display
}//child class

class employee extends SBI
{
	int bonus;
	
	public employee(String Bank_name, int bonus)
	{
		super(Bank_name);
		this.bonus=bonus;
	}
	
	void display()
	{
		System.out.println("Bank Name: "+Bank_name+"\nBonus :"+bonus);
	}
}
public class multipalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee("State bank of india",30000);
		emp.display();	
	}

}
/*
 * output
 * Bank Name: State bank of india
Bonus :30000
*/
