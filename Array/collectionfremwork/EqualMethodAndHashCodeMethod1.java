package collectionFremwork;
class Employee1 extends Object
{
	int age, salary;
	String name;
	
	public Employee1(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	
	//
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
			
		}
		
		//if parameternull or both are not same class  
		if(obj == null || this.getClass()!=obj.getClass())
		{
			return false;
		}
		
		//Compare using data member
		Employee1 emp = (Employee1)obj;
		
		//compare 2 obj i.e. e1 & e2
		return this.name == emp.name 
				&& this.age == emp.age
				&& this.salary == emp.salary;
		
	}

	public int hashCode()
	{
		return this.name.length()%10;
	}

}
public class EqualMethodAndHashCodeMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(25,37000,"Sachin");
		Employee1 e2 = new Employee1(45,40000,"Virat");	//False
			
		Employee1 e3 = new Employee1(45,40000,"Sachin");
		Employee1 e4 = new Employee1(45,40000,"Sachin");	//true
		
		if(e1.hashCode() == e2.hashCode())
		{
			System.out.println(e1.equals(e2));	
		}	
		else
		{
			System.out.println("Not equal");	
		}
		
		
		if(e3.hashCode() == e4.hashCode())
		{
			System.out.println(e3.equals(e4));	
		}	
		else
		{
			System.out.println("Not equal");	
		}
	}

}
/*
output
Not equal
true
*/