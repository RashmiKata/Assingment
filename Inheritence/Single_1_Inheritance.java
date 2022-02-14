package inheritanceExample;

class bank{
	String bankName;
	int x=10;
	public bank(String bankName) {
		this.bankName=bankName;
	}
	public int intrest() {
		return 8;
	}
}
class sbi extends bank{
	int x=100;
	public sbi(String bankName) {
		super(bankName);
	}
}
class axis extends bank{
	int x=100;
	public axis(String bankName) {
		super(bankName);
	}
	public int intrest() {
		return 5;
	}
}
public class Single_1_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;//refrence variable tye super class
		b=new sbi("sbi");// create object of chilf type
		System.out.println("Intrest rate of sbi="+ b.intrest());
		b=new axis("Axis bank");
		System.out.println("Intrest rate of axis="+ b.intrest());
	}

}

/*
 * output
 * Intrest rate of sbi=8
Intrest rate of axis=5

 */
