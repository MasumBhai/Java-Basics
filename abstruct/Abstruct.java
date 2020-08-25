

///abstruct class  cannot be instantiated
///benefit of abstruct class: it shares common method so we don't have to write duplicate code again & again
abstract class Human{
    public abstract void eat();  //if we have abstruct method then the class should also be abstruct
    public void walk(){

    }
}
class Men extends Human     //this Men class here is called concreate class
{
    //if you extends the abstruct class , then it's compulsory to write abstruct method
    public void eat(){

    }
}
class printer{
    public void show(Number n)  //advantage is we can pass now double or integer value as an object
    {
        System.out.println(n);
    }
}


abstract class writer{
int cost ;
String company;

    public void setData(int cost, String company) {
        this.cost = cost;
        this.company = company;
    }
    abstract void Display();
}
class pen extends writer{
    @Override
    public void Display()
    {
        System.out.println("Company : "+ company);
        System.out.println("cost    : "+ cost);
    }
}
class pencil extends writer{
    @Override
    public void Display()
    {
        System.out.println("Company : "+ company);
        System.out.println("cost    : "+ cost);
    }
}
public class Abstruct {

    public static void main(String[] args) {

        Human student = new Men();
        printer paper = new printer();
        paper.show(6.9);

        pen object1 = new pen();
        object1.setData(10,"matador");
        pencil object2 = new pencil();
        object2.setData(05,"Favour Castle");

        object1.Display();
        object2.Display();

    }
}
