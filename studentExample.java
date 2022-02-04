package OOPsExample;
class student
{
	int id;
	String name;
	int roll_no;

	public void setData(int i, String n, int r)
	{
		id=i;
		name=n;
		roll_no=r;
	}
	
	public void putData()
	{
		System.out.println("id "+id+" "+"name:"+name+" "+"roll no "+roll_no);

	}
}
public class studentExample {

	public static void main (String[]  args) {
		
		student rashmi=new student();
		rashmi.setData(128, "Rashmi", 30);
		rashmi.putData();
		
		student om=new student();
		om.setData(112, "Om", 10);
		om.putData();
		
		//System.out.println("id" +rashmi.id+ "" +"name" +rashmi.name+ "" +"roll_no" +rashmi.roll_no);
	}
}
/*
 * output
 * id 128 name:Rashmi roll no 30
id 112 name:Om roll no 10
*/
 


