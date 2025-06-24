package demo;

public class ThreadInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThreadInterface t1= new ThreadInterface();
      Thread t2=new Thread(t1);
      
	

}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
	}
	}
