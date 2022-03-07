package ExpreationHandling;

import java.util.Scanner;

class TaxCalculator
{
	String emp_name;
	boolean isIndian;
	double emp_Sal;
	
	private TaxCalculator(String emp_name, boolean isIndian, double emp_Sal) {
		super();
		this.emp_name = emp_name;
		this.isIndian = isIndian;
		this.emp_Sal = emp_Sal;
	}

	public static void Calculate_tax(String emp_name, boolean isIndian,double emp_Sal)
	{
		
		double taxAmount=0;
		
		try 
		{
			if(isIndian == false)
			{
				throw new Test("The employee should be an Indian citizen for calculating tax.");
				
			}//if
			else if(emp_name.isEmpty())
			{
				throw new Test("The employee name can not be empty.");
			}
			else if(emp_Sal>100000 && isIndian==true)
			{
				taxAmount = (emp_Sal*8)/100;
				System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
			}
			else if(50000<emp_Sal && emp_Sal<=100000 && isIndian==true)
			{
				taxAmount = (emp_Sal*6)/100;
				System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
			}
			else if(30000<emp_Sal && emp_Sal<=50000 && isIndian==true)
			{
				taxAmount = (emp_Sal*5)/100;
				System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
			}
			else if(10000<emp_Sal && emp_Sal<=30000 && isIndian==true)
			{
				taxAmount = (emp_Sal*4)/100;
				System.out.println("\nEmployee_name:  "+emp_name+"\nEmployee_salary: "+emp_Sal+"\nTax_Amount: "+taxAmount);
			}
			else
			{
				System.out.println("The employee does not need to pay tax.");
			}
			
		}//try
		
		catch(Test t)
		{
			System.out.println(t.getMessage());
			
		}//catch
		finally
		{
			System.out.println("Thank you....!!!"); 
		}
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		String emp_name, country;
		boolean b;
		double emp_Sal;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		emp_name=sc.nextLine();
		
		System.out.println("Enter your nationality:");
		country =sc.nextLine();
		if(country.equalsIgnoreCase("India"))
		{
			b=true;
		}
		else
		{
			b=false;
		}	
		
		System.out.println("Enter your salary:");
		emp_Sal = sc.nextDouble();
		
		TaxCalculator.Calculate_tax(emp_name,b,emp_Sal);
		
	}

}

/*
 output
 Enter your name:
rashmi
Enter your nationality:
UK
Enter your salary:
50000
The employee should be an Indian citizen for calculating tax.
Thank you....!!!
**************************************************************
Enter your name:

Enter your nationality:
india
Enter your salary:
50000
The employee name can not be empty.
Thank you....!!!
**************************************************************
Enter your name:
rashmi
Enter your nationality:
india
Enter your salary:
50000

Employee_name:  rashmi
Employee_salary: 50000.0
Tax_Amount: 2500.0
Thank you....!!!
**************************************************************
Enter your name:
Lalit
Enter your nationality:
india
Enter your salary:
2000
The employee does not need to pay tax.
Thank you....!!!
**************************************************************
*/
