package OOPsExample;
import Inheritance.Employee;

class Employee1
{
	int empid;
	String name, city, state, country;
	long phno;
	double salary;
	
	public Employee1(int empid, String name, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
	}
	
	public Employee1(int empid, String name, double salary, long phno, String city )
	{
		this(empid,name,salary);		//this is constructor  here for calling above 1st employee constructor
			this.phno=phno;
			this.city=city;
				
	}
	
	public Employee1(int empid, String name, double salary, long phno, String city, String state, String country)
	{
		this(empid,name,salary,phno,city);		//this is constructor  here for calling above 2nd employee constructor
		this.state=state;
		this.country=country;
	}

	public int getEmpid() {
		return empid;
	}

		public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public long getPhno() {
		return phno;
	}


	public double getSalary() {
		return salary;
	}

}


public class constructorOverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(101, "Rashmi", 30000, 962512, "Pune", "Maharashtra", "india");

		System.out.println(" "+e1.getEmpid()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getPhno()+" "+e1.getCity()+" "
		+e1.getState()+" "+e1.getCountry());

	}

}
/*
output
101 Rashmi 30000.0 962512 Pune Maharashtra india
*/