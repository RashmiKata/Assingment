package OOPsExample;
public class employeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee st1=new employee();
		 st1.setEmp_id(124543);
		 st1.setEmp_name("Rashmi Katakdound");
		 st1.setEmp_salary(50000);
		 
		System.out.println("emp_id:-" +st1.getEmp_id());
		 System.out.println("emp_name:-" +st1.getEmp_name());
		 System.out.println("emp_salary:-" +st1.getEmp_salary());
		 
		 employee st2=new employee();
		 st2.setEmp_id(34562);
		 st2.setEmp_name("Lalit Khandare");
		 st2.setEmp_salary(80000);
		 
		 System.out.println("emp_id:-" +st2.getEmp_id());
		 System.out.println("emp_name:-" +st2.getEmp_name());
		 System.out.println("emp_salary:-" +st2.getEmp_salary());
	}

}
class employee
{	
	int emp_id;
	String emp_name;
	int emp_salary;
	
	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	public void putData()
	{
		System.out.println("emp_id "+this.emp_id+" "+"emp_name:"+this.emp_name+" "+"emp_salary "+this.emp_salary);

	}

}
/*
 * output
 * emp_id:-124543
emp_name:-Rashmi Katakdound
emp_salary:-50000
emp_id:-34562
emp_name:-Lalit Khandare
emp_salary:-80000
*/
