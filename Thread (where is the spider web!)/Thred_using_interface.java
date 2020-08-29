//why use Runnable Interface instead of Thread, cause Java doesn't support multiple inheritence of class but it supports multiple interfaces
class Hi implements Runnable
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

class Hello implements Runnable
{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try{ Thread.sleep(800); } catch (Exception e){}
        }
    }
}
public class Thred_using_interface {

    public static void main(String[] args) {
        Runnable obj_of_Hi = new Hi(); //here we have created reference of Runnable which is object of Hi class
        Runnable obj_of_Hello = new Hello(); //here we implement Runnable interface

        Thread T1 = new Thread(obj_of_Hi);
        Thread T2 = new Thread(obj_of_Hello);//remember we have to pass here an object

        T1.start();
        try{ Thread.sleep(10); } catch (Exception e){} //if we comment out this line,cause Both Hi & Hello have same priority,so we will see a clash when both either hello or Hi will print
        T2.start();
    }
}
