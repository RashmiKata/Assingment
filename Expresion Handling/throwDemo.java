package ExpreationHandling;

public class throwDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vaccination.agevalidate(20);
vaccination.agevalidate(13);
	}

}
class vaccination
{
	public static void agevalidate(int age)
	{
		try {
		if (age<18) {
			throw new CovidVaccineValidateException("Age is not valid for vaccination");
		}
		else
		{
			System.out.println("Age is valid for vaccination");
		}
	}
	catch(CovidVaccineValidateException e)
	{
		System.out.println(e.getMessage());
	}
	}
}
/*
output
Age is valid for vaccination
Age is not valid for vaccination
*/