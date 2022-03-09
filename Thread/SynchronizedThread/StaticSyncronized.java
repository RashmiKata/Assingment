package SyncronizationThreadExample;

class NumberTable2
{
	synchronized static void printTable(int n)
	{
		for(int i=1; i<=5; i++)
		{	
			System.out.println(Thread.currentThread().getName()+" : " +n*i);
			try 
			{
				Thread.sleep(500);
			}//try
			catch(Exception e)
			{
				System.out.println(e);
			}//catch
			
		}//for
		
	}//void
}
public class StaticSyncronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread("thread 1 -")
		{
			public void run()
			{
				NumberTable2.printTable(5);		}
			
		};
		
		Thread t2 = new Thread("thread 2 -")
		{
			public void run()
			{
				NumberTable2.printTable(10);		}
			
		};
		
		Thread t3 = new Thread("thread 3 -")
		{
			public void run()
			{
				NumberTable2.printTable(100);		
			}
			
		};
		
		Thread t4 = new Thread("thread 4 -")
		{
			public void run()
			{
				NumberTable2.printTable(100);		
			}
			
		};
		
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		}
}


/*
 * thread 1 - : 5
thread 1 - : 10
thread 1 - : 15
thread 1 - : 20
thread 1 - : 25
thread 4 - : 100
thread 4 - : 200
thread 4 - : 300
thread 4 - : 400
thread 4 - : 500
thread 3 - : 100
thread 3 - : 200
thread 3 - : 300
thread 3 - : 400
thread 3 - : 500
thread 2 - : 10
thread 2 - : 20
thread 2 - : 30
thread 2 - : 40
thread 2 - : 50
*/
 

