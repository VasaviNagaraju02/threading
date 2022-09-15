package threading;
//Java Program to display all the running threads using
//ThreadGroup object

import java.io.*;

class DThread extends Thread {
	
	public void run()
	{
		System.out.println("Overridden Run Method");
	}
}

public class Thread_Display {

	public static void main(String[] args)
	{
				DThread t1 = new DThread();
		DThread t2 = new DThread();
		t1.start();
		t2.start();

		
		ThreadGroup threadGroup
			= Thread.currentThread().getThreadGroup();

		
		int threadCount = threadGroup.activeCount();

		Thread threadList[] = new Thread[threadCount];
		
		threadGroup.enumerate(threadList);

		System.out.println("Active threads are:");
	
		
		for (int i = 0; i < threadCount; i++)
			System.out.println(threadList[i].getName());
	}
}



