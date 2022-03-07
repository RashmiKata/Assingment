package ThreadExample;


public class TestSleepMethod extends Thread{


	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			//System.out.println(i);
			System.out.println(Thread.currentThread().getName()+" = "+ i);
		}
	}
	
	public static void main(String[] args) {
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		TestSleepMethod t3= new TestSleepMethod();
		
		t1.start();
		try {
			t1.join(1500);
		}
		catch (InterruptedException ee){
			System.out.println(ee);
		}//t1.start();//IllegalThreadStateException
		
		t2.start();
		t3.start();
	}
}
/*
output
0
0
1
1
2
2
3
3
4
4
5
5
*/
/*
Thread-0 = 0
Thread-0 = 1
Thread-0 = 2
Thread-1 = 0
Thread-2 = 0
Thread-0 = 3
Thread-1 = 1
Thread-2 = 1
Thread-0 = 4
Thread-1 = 2
Thread-2 = 2
Thread-0 = 5
Thread-1 = 3
Thread-2 = 3
Thread-1 = 4
Thread-2 = 4
Thread-1 = 5
Thread-2 = 5
*/