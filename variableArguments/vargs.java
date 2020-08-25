class Calc{
    public int add(int ... n)   //the parameter will reach here as an array
    {
        int s =0;
        for(int i : n)
        {
           s += i;
        }
        return s;
    }
}
public class vargs {

    public static void main(String[] args) {

    Calc obj = new Calc();
    System.out.println(obj.add(4,5,6,9));

    }
}
