
//Types of interface
//1.Normal -> more than one method
//2.Single abstruct method -> it only have one method -> this is called funtional interface->Lambda Expression -> from Scala language
//3.Marker interface -> it doesn't have any method
//Serializable

abstract class Abc {
	void show() {
	}
}

@FunctionalInterface
		//it will prevent us from creating more than one method in interface
//But here it does not create any error even our interface 'ABCD' has two method.
//So,we can create multiple default method but if it is funtional interface,then we must keep only one abstruct method along with multiple default method
interface ABCD {
	void showmethod();

	default void fool() {
		System.out.println("hii! i'm inside interface ABCD's default method");
	}
	//can we override our default method?Let's see in our implemented class
}

interface Alphabet {
	default void fool() {
		System.out.println("hii! i'm inside interface Alpahabet's default method");
	}
}

//java does not support multiple inheritence but interface can do it
class Demo implements Alphabet, ABCD {
	//at least one method , we have to override of interface class
	public void demo() {
		System.out.println("inside demo method which implements ABCD interface");
	}

//	//	//so,here i'm overriding
//	public void showmethod() {
//		System.out.println("this is overridden result");
//	}

	public void fool() {
		//System.out.println("You are really fool,cause you don't know that");
		//here we solved the multiple inheritence issue and specify which interface method will it print
		Alphabet.super.fool(); //this is for calling interface Alphabet's fool method here
	}
	//from here we want to call interface Alphabet's  fool method
}

public class Main {

	public static void main(String[] args) {
		System.out.println("******************************");
		Abc obj001 = new Abc() {
			public void show() {
				System.out.println("\"I Love you,Man\" said abstract class");
			}
		};
		obj001.show();
		//we can achieve the same thing using interface
		ABCD obj = () -> System.out.println("\"I Love you,Man\" said interface which is now lambda expressed ");
		obj.showmethod();
		obj.fool();//we are calling it from abstract
		//So,lamda expression only works on functional interface that has only one method

		//now we want to create object of interface,how can we achieve it// ?
		//in java we can not create object of interface but we can create reference of interface
		ABCD obj_of_interface = new Demo(); ///here we create refernce of interface\
		obj_of_interface.fool(); //we are calling it frpom interface


	}
}
//abstruct class -> we can define and declare method
//interface -> we can only declare method
//But we can define method in interface with the help of 'default' keyword
//wait,does this 'default' key word has any draw back?
/*
if we run this we will see error cause our Demo class does not override interface's showmethod function
uncomment the 40-43 lines,then run it
 */
