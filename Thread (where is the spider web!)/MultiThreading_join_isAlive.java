import static java.lang.Thread.*;

public class MultiThreading_join_isAlive {

	public static void main(String[] args) {
		Thread T1 = new Thread(() ->
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("Hi" + " ----- Thread Priority: " + Thread.currentThread().getPriority());
				try {
					sleep(800);
				} catch (Exception e) {
				}
			}
		},"MasumBhai processor 01");
		Thread T2 = new Thread(() ->
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello" + " ----- Thread Priority: " + Thread.currentThread().getPriority());
				try {
					sleep(800);
				} catch (Exception e) {
				}
			}
		},"MasumBhai processor 02");
    
		System.out.println("Before setting thread name :");
		System.out.println(T1.getName() );
		System.out.println(T2.getName() );
		System.out.println("After setting thread name :");
		T1.setName("MasumBhai processor 01");
		T2.setName("MasumBhai processor 02");
		System.out.println(T1.getName() );
		System.out.println(T2.getName() );
		System.out.println();
		System.out.println("(actually pririty range is 1~10) T1's priority : " + T1.getPriority());
		System.out.println("(actually pririty range is 1~10) T2's priority : " + T2.getPriority());
		System.out.println();
		T1.setPriority(Thread.MIN_PRIORITY);
		T2.setPriority(Thread.NORM_PRIORITY);
    
		T1.start();
		try {Thread.sleep(1);} catch (Exception e) {}
		System.out.println("T1's active state : " + T1.isAlive()); //it checks Does T1 Thread is active now or not?
		T2.start();
		//System.out.println("Bye Bye");
		//if we execute here , comment all the next line & run it, we will see Bye Bye is printing somewhere in between
		//But we want to print out at last
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
		}
		System.out.println("Bye Bye");
//
//					         main thread
//		T1 thread	-------------*---------------   T2 thread
//			        |            |              |
//			        |	         |	            |
//			        |            |              |
//			        |            |              |
//                  |            |              |
//		T1 thread   --->---------*------<-------    T2 thread
//				        T1.join();T2.join();
//
		System.out.println("now, T1's active state : " + T1.isAlive()); //after joining,we are checking whether T1 thread is alive or not
	}
}
