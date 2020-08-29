class Counter{
	int count;
	//if we don't declare Thread then multiple Thread can access this method
	public synchronized void increment() //if we declare synchronized then only one thread will work on this method
	{
		count++;
	}

}
public class Syncronized_MultiThreading {

	public static void main(String[] args) throws Exception
	{

		Counter obj_of_Counter = new Counter();
		obj_of_Counter.increment();
		//but, i want to call this increment() method thousand time , then our main thread will do this alone
		//But,we want to call this increment() method , using (suppose 2) thread
		Thread T1 = new Thread(new Runnable (){
			public void run() {
				for (int i = 1;i<=1000;i++)
				{
					obj_of_Counter.increment();
				}
			}
		});
		Thread T2 = new Thread(new Runnable (){
			public void run() {
				for (int i = 1;i<=1000;i++)
				{
					obj_of_Counter.increment();
				}
			}
		});
		T1.start();
		T2.start();
		T1.join();
		T2.join();

		System.out.println("count : " + obj_of_Counter.count);
	}
}
