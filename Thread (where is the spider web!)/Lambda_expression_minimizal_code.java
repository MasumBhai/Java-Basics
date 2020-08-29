
//why use Runnable Interface instead of Thread, cause Java doesn't support multiple inheritence of class but it supports multiple interfaces
//Here is using class
//class Hi implements Runnable
//{
//    public void run() //our funtion name was show() But due to thread start method we are writing here run
//    {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hi");
//            //Thread.sleep(500);  //if we do this , it will show us InterruptedException , so we have to catch this error
//            try{ Thread.sleep(800); } catch (Exception e){}
//        }
//    }
//}
//
//class Hello implements Runnable
//{
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hello");
//            try{ Thread.sleep(800); } catch (Exception e){}
//        }
//    }
//}
public class Lambda_expression_minimizal_code {
	public static void main(String[] args) {
		//here is using annonymmous class
		// here we have created reference of Runnable which is object of Hi class
//        Runnable obj_of_Hi = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("hi");
//                    //Thread.sleep(500);  //if we do this , it will show us InterruptedException , so we have to catch this error
//                    try{ Thread.sleep(800); } catch (Exception e){}
//                }
//            }
//        };
//        //here we implement Runnable interface
//        Runnable obj_of_Hello = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("hello");
//                    try{ Thread.sleep(800); } catch (Exception e){}
//                }
//            }
//        };
//But no,I want more short code,let's do it in lambda way
//		Runnable obj_of_Hi = () ->
//		{
//			for (int i = 0; i < 5; i++) {
//				System.out.println("hi");
//				//Thread.sleep(500);  //if we do this , it will show us InterruptedException , so we have to catch this error
//				try {
//					Thread.sleep(800);
//				} catch (Exception e) {
//				}
//			}
//		};
//		Runnable obj_of_Hello = () ->
//		{
//			for (int i = 0; i < 5; i++) {
//				System.out.println("hello");
//				try {
//					Thread.sleep(800);
//				} catch (Exception e) {
//				}
//			}
//		};
//		Thread T1 = new Thread(obj_of_Hi);
//		Thread T2 = new Thread(obj_of_Hello);//remember we have to pass here an object
//
//		T1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		} //if we comment out this line,cause Both Hi & Hello have same priority,so we will see a clash when both either hello or Hi will print
//		T2.start();
//
// No,no,no I want more short code!!!!
		Thread t1 = new Thread( () ->
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(800);
				} catch (Exception e) {
				}
			}
		} );
		Thread t2 = new Thread( () ->
		{
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(800);
				} catch (Exception e) {
				}
			}
		} );

		t1.start();
		try{ Thread.sleep(10);}catch (Exception e){}
		t2.start();
	}
}
