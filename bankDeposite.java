package OOPsExample;

import java.util.Scanner;

public class bankDeposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long withdraw,acbalance,deposite = 0;
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
		Bank rashmi=new Bank(acno,holdername,acbalance,deposite);	
//Bank rashmi=new Bank(76548, "Rashmi Katakdound", 500000);
//Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withraw");
		withdraw = sc.nextLong();
		rashmi.withdraw(withdraw);
		System.out.println("Enter ammount to deposite");
		deposite=sc.nextLong();
		rashmi.deposite(deposite);
		rashmi.checkBalance();
	}

}

/*
 * output
 Enter account no:
123456789
Enter account holder name:
Rashmi
Enter Balance:
100000
Enter amount to withraw
20000
20000Withdraw has done successfully.
Enter ammount to deposite
50000
50000Deposite has done successfully.
account no:123456789
account holder name:Rashmi
account balance:130000

 */
