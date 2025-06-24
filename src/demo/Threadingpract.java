package demo;

public class Threadingpract extends Thread
{
	public void run() {   ///thread are in  running state
	       
		
		System.out.println("thread are running");

		
		   
		    for(int i=0;i<5;i++) {
		    	
			 try {
				Thread.sleep(2000);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			 System.out.println(i);
		 }
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threadingpract t1 =new Threadingpract();
		
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
		
		Threadingpract t2 =new Threadingpract();
		t2.setName("jobito");                      ///when we have to set name for thread used setName method.
		t2.setPriority(MAX_PRIORITY);
		
//		System.out.println(t2.getId());
//		System.out.println(t2.getName());		
//		System.out.println(t2.getPriority());
//		
		t1.start();
        t1.run();
       
		
		
		
	
		
		
	}

	
}
