import java.util.*;

public class Slip13_q1 extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("The thread name is "+Thread.currentThread().getName());
		}
	}

	public static void main(String []args)
	{
		Slip13_q1 t1= new Slip13_q1();
		t1.setName("Main Thread");
		t1.start();
		Thread t2 = currentThread();
		t2.setName("Current thread");
		for(int i=0;i<5;i++)
		{
			System.out.println("The thread name is "+t1.currentThread().getName());
		}
	}

}