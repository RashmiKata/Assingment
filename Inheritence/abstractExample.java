package inheritanceExample;
public class abstractExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
user u=new user("rashmi");
u.display();
u.method();
	}

}
abstract class student
{
	String name;
	public student(String name) {
		super();
		this.name=name;
	}
	void display() {
		// TODO Auto-generated method stub
		
	}
	public void method() {
		System.out.println("Abstract class in perent class");
	}
	
}

class user extends student
{
	public user(String name) {
		super(name);
	}
	
@Override
void display() {
	System.out.println("user class disply"+name);
	}
}

/*
 * output
 * user class displyrashmi
Abstract class in perent class
*/
 


