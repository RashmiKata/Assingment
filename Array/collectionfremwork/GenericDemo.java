package collectionFremwork;
class Container<T>
{
	 T value;
	 
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show()
	 {
		 System.out.println(value);
		 System.out.println(value.getClass().getName());
	 }
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> obj = new Container();
		//obj.value="hello";
		obj.setValue("hello");
		obj.show();
	}

}
/*
output
hello
java.lang.String
*/