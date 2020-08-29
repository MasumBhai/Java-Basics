//what is Thread - unit of a process
// @auther Masum
class Hi extends Thread
{
	public void run() //our funtion name was show() But due to thread start method we are writing here run
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			//Thread.sleep(500);  //if we do this , it will show us InterruptedException , so we have to catch this error
			try{ Thread.sleep(800); } catch (Exception e){}
			}
	}
}

class Hello extends Thread
{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try{ Thread.sleep(800); } catch (Exception e){}
		}
	}
}

public class Thread_using_class
{

	public static void main(String[] args) {
		Hi obj_of_Hi = new Hi();
		Hello obj_of_Hello = new Hello();
			obj_of_Hi.start();  ///internally .start() ; it calls run,instead of our method
			try{ Thread.sleep(10); } catch (Exception e){} //if we comment out this line,cause Both Hi & Hello have same priority,so we will see a clash when both either hello or Hi will print
		obj_of_Hello.start();
		//obj_of_Hi.show();   //if we don't use thread , first it will run
		//obj_of_Hello.show(); // second it will run,But i want to execute it parallel-y , how?say: first->hi,second->hello,third->hi,fourth->hello continue


	}
}
//now i want to see my output as one by one,let's pause it
