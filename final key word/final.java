

//after running you will see error . why that occured?? you can solve it..

 class A  //if a class is final then we can not inherit that class
               ///cause we don't want anyone to overwrite our base class
{
    final int i;  ///if a variable is final,then it is constant
    public A()
    {
        i = 15;
        i = 69;
    }
    public static final void show(){
        System.out.println("I'm in A class now...");
    }
}
class B extends A{
    public static void show(){
        System.out.println("I'm in B class now...");
    }
}
public class final {

    public static void main(String[] args) {
        System.out.println("***********************");
A obj_of_A = new A();
B obj_of_B = new B();
B.show();

    }
}
