
class A {
	public A() {
		System.out.println("inside of class A");
	}

	public A(int i) {
		System.out.println("inside of class A int");
	}
	public A(int ... n) {
		System.out.println("inside of class A int array");
	}
}

class B extends A {
	public B() {
		//by default,here lies super()
		super(5);
		System.out.println("inside of class B");
	}

	public B(int i) {
		//by default,here lies super()
		System.out.println("inside of class B int");
	}
	public B(int ... n) {
		super(n);
		System.out.println("inside of class B int array");
	}
}

class C extends B {
	public C() {
		//by default,here lies super()
		System.out.println("inside of class C");
	}

	public C(int i) {
		//by default,here lies super()
		System.out.println("inside of class C int");
	}
	public C(int ... n) {
		super(n);
		System.out.println("inside of class C int array");
	}
}

public class super_example {


	public static void main(String[] args) {
		System.out.println("******************************");
		C obectof_C = new C();
		System.out.println("******************************");
		C obectof_Cint = new C(5);
		System.out.println("But i want to call parametrized constructor of base classes, what to do?");
		System.out.println("we have to write super method inside of our parametrized construcor");
		System.out.println("******************************");
		C objof_Carray = new C(5,4,6);
		System.out.println("******************************");
		System.out.println("now my requirement is, i want to call parametized constructor of C,\nDefalt constructor of B & parametrized constructor");
		C requredObj = new C(5);
	}
}
