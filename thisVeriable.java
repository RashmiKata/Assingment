package OOPsExample;
class student1
{
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	int id;
	String name;
	int roll_no;

	/*public void setData(int id, String name, int roll_no)
	{
		this.id=id;
		this.name=name;
		this.roll_no=roll_no;
	}*/
	
	public void putData()
	{
		System.out.println("id "+this.id+" "+"name:"+this.name+" "+"roll no "+this.roll_no);

	}
}

public class thisVeriable {

	public static void main (String[]  args) {
		
		/*student1 rashmi=new student1();
		rashmi.setData(128, "Rashmi", 30);
		rashmi.putData();
		
		student1 om=new student1();
		om.setData(112, "Om", 10);
		om.putData();*/
		
		 student1 st1=new student1();
		 st1.setId(01);
		 st1.setName("Rashmi Katakdound");
		 st1.setRoll_no(50);
		 
		 System.out.println("id" +st1.getId());
		 System.out.println("name" +st1.getName());
		 System.out.println("roll_no" +st1.getRoll_no());
		}
}
/*
 * id1
nameRashmi Katakdound
roll_no50
*/
