package OOPsExample;
class bankinfo
{
	int acc_no;
	String name; 
	float amount;
	
	public void set_data(int no, String aa_name, float aa_amount)
	{
		acc_no= no;
		name = aa_name;
		amount= aa_amount;
	}

	public void putData()
	{
		System.out.println("acc_no:"+acc_no+" "+"name:"+name+" "+"amount:"+amount+" ");
	}
	
	public void withdraw(float Famount)
	{
		if(Famount>amount)
		{
			System.out.println("Ammount is not Sufficient to withdraw.");
		}
		else
		{
			System.out.println("Ammount is Sufficient to withdraw.");

		}
	}
}


public class bankAccount {

	public static void main(String[] args) {
	
		bankinfo cust1 = new bankinfo();
		cust1.set_data(132, "ABC", 10000);
		cust1.putData();
		cust1.withdraw(5000);
		
		bankinfo cust2 = new bankinfo();
		cust2.set_data(123, "abc", 10000);
		cust2.putData();
		cust2.withdraw(15000);
	}

}
/*
 * output
 * acc_no:132 name:ABC amount:10000.0 
Ammount is Sufficient to withdraw.
acc_no:123 name:abc amount:10000.0 
Ammount is not Sufficient to withdraw.
*/
