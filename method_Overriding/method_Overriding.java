class A{
    public void show(){
        System.out.println("inside of A");
    }
    public void Example(){
        System.out.println("inside of A class now");
    }
}
class B extends A
{
    @Override
    public void show(){
        System.out.println("inside of B");
    }
    @Override
    public void Example(){
        super.Example();
        System.out.println("inside of B class now");
    }
}

public class method_Overriding {

    public static void main(String[] args) {
        System.out.println("****************************");
    B obj_of_B = new B();
    obj_of_B.show();
        System.out.println("So,exactly what is method overriding ?\nThe child class method override parent classes method");
        System.out.println("****************************");
        System.out.println("now,i want to call both overriding method.\nWhat to do?______use super()");
        obj_of_B.Example();
        System.out.println("ok,But how about variable?");
        System.out.println("Then,we will also use super.variable in the child class");

    }
}
