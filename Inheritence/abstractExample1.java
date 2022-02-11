package inheritanceExample;
abstract class baank{
	abstract void getInherestRast();
}

class city extends baank{
	@Override
	void getInherestRast() {
		System.out.println("child city class interest 2%");
		
	}
}

abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	@Override
	void draw() {
	System.out.println("draw rectangle");
	}
}

class circle extends shape{
	@Override
	void draw() {
		System.out.println("draw crircle");
	}
}

public class abstractExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r =new rectangle();
		r.draw();
		
		circle c=new circle();
		c.draw();
		
		city b1=new city();
		b1.getInherestRast();
	}

}
/*
output
draw rectangle
draw crircle
child city class interest 2%
*/