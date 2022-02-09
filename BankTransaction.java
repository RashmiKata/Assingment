package OOPsExample;

import java.util.Scanner;
class Bank
{
	int acc_no;
	String holdername;
	long acc_balance;
	
	public Bank(int acc_no, String holder_name, long acc_balance)
	{
		this.acc_balance=acc_balance;
		this.acc_no=acc_no;
		this.holdername=holder_name;
	}
	
	public void withdraw(long amount)
	{
		if((amount<acc_balance) && (amount>=500))
		{
			acc_balance=acc_balance-amount;
			System.out.println(amount+"Withdraw has done successfully.");
		}
		else
		{
			System.out.println("Insufficient balance! deposite first");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("account no:"+this.acc_no);
		System.out.println("account holder name:"+this.holdername);
		System.out.println("account balance:"+this.acc_balance);
	}
}



public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long withdraw,acbalance;
		int acno;
		String holdername;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account no:");
		acno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder name:");
		holdername=sc.nextLine();
		
		//sc.nextLine();
		
		System.out.println("Enter Balance:");
		acbalance=sc.nextLong();
		Bank rashmi=new Bank(acno,holdername,acbalance);	
//Bank rashmi=new Bank(76548, "Rashmi Katakdound", 500000);
//Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withraw");
		withdraw = sc.nextLong();
		rashmi.withdraw(withdraw);
		rashmi.checkBalance();
	}

}

/*
output
Enter account no:
1234
Enter account holder name:
rashmi
Enter Balance:
400000
Enter amount to withraw
10000
10000Withdraw has done successfully.
account no:1234
account holder name:rashmi
account balance:390000

*/