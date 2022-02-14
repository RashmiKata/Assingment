package inheritanceExample;
class studente
{
	int id;
	String name;
	
	Address address; //entity reference creation

	public studente(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void Display()
	{
		
		System.out.println("ID: "+id+"Name: "+name);
		System.out.println("City: "+address.city+"State: "+address.state+" "+"Country: " +address.country);
	}
	
}
public class aggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("Pune","MH","India");
		Address add2 = new Address("kondhwa","MH","India");
				
		studente s1 = new studente(20,"ABC",add1);
		studente s2 = new studente(48,"XYZ",add2);
		
		s1.Display();
		s2.Display();
	}

}
/*
output
ID: 20Name: ABC
City: PuneState: MH Country: India
ID: 48Name: XYZ
City: kondhwaState: MH Country: India*/