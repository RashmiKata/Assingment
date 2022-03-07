package SyncronizationThreadExample;
class NumberTable1
{
	void printTable(int n)
	{
		System.out.println("synchronzed blok example");
		synchronized(this)  
		
	//synchronized void printTable(int n)//synchronized
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
			try 
			{
				Thread.sleep(500);
			}//try
			catch(Exception e)
			{
				System.out.println(e);
			}//catch
		}//for
	}//method
}
}
public class SyncronizedBlok {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final NumberTable nt=new NumberTable();
		
		Thread t1=new Thread()
				{
					public void run()
					{
						nt.printTable(5);
					}
				};
				Thread t2=new Thread()
				{
					public void run()
						{
							nt.printTable(10);
						}
				};
				t1.start();
				t2.start();
	}

}
/*
 * synchronzed blok example
synchronzed blok example
Thread-1 : 10
Thread-1 : 20
Thread-1 : 30
Thread-1 : 40
Thread-1 : 50
Thread-0 : 5
Thread-0 : 10
Thread-0 : 15
Thread-0 : 20
Thread-0 : 25
*/
