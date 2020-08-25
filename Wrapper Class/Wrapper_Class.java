
//int,float,double
//int i=5 ->this means it is prmitive data type
//but OOPS said everything should be object , so what to do?
//we should use class instead...
//for int we have Integer class
//for float we have Float class
//for char we have Character class
//for double we have Double class
//for boolean we have Boolean class
//for short we have Short class
//for long we have Long class
//for byte we have Byte class

public class Wrapper_Class {

    public static void main(String[] args) {
        int primitivevalue = 48;    //primitive datatype
        Integer referabceValue = new Integer(48);   //wrapper class
        //now if we do this
        Integer x = new Integer(primitivevalue); //this is called Boxing or wrapping
        //actually now,our object is holding primitive data type
        //now,what if we want to store that value at a primitive data
        //we have to use, object.intValue()
        int test = x.intValue();    //unboxing-unwrapping
        System.out.println(test);

        //But our jdk is very intellectual,we don't want to write all this
        Integer objofClass = primitivevalue;    //auto-Boxing
        int y = objofClass;     //auto-unBoxing
        System.out.println(y);

        ///cons : wrapper classes is slower than normal primitive type
        //another example
        String str = "69";
        int n = Integer.parseInt(str);
        System.out.println(n);
        
    }
}
