package demo;

public class RunnableDemo implements Runnable{

	public static void main(String[] args) 
	{
		RunnableDemo rd = new RunnableDemo();
		Thread t1 = new Thread(rd);   //Thread in a new state
		t1.start();      //Thread in a ready state
		

	}

	@Override
	public void run() {					//Thread in a running state
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}

}
