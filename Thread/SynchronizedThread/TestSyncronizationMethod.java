package SyncronizationThreadExample;

//shared object
class NumberTable
{
	synchronized void printTable(int n)//synchronized
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

/*
class thread1 extends Thread
{
	NumberTable numberTable;
	public thread1(NumberTable nt)
	{
		numberTable=nt;
	}
	public void run()
	{
		numberTable.printTable(5);
	}
}


class thread2 extends Thread
{
	NumberTable numberTable;
	public thread2(NumberTable nt)
	{
		numberTable=nt;
	}
	public void run()
	{
		numberTable.printTable(10);
	}
}*/
public class TestSyncronizationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final NumberTable nt=new NumberTable();
		/*thread1 t1=new thread1(nt);
		thread2 t2=new thread2(nt);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();*/
		
		//
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
 * output
 Thread 1 : 5
Thread 1 : 10
Thread 1 : 15
Thread 1 : 20
Thread 1 : 25
Thread 2 : 10
Thread 2 : 20
Thread 2 : 30
Thread 2 : 40
Thread 2 : 50
*/
