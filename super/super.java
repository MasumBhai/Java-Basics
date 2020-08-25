class A {
	public A() {
		System.out.println("inside of class A");
	}
}

class B extends A {
	public B() {
		System.out.println("inside of class B");
	}
}

class C extends B {
	public C() {
		System.out.println("inside of class C");
	}
}

public class Main {

	public static void main(String[] args) {
		A objectof_A = new A();
		System.out.println("******************************");
		B objectof_B = new B();
		System.out.println("******************************");
		C obectof_C = new C();
		//so,whenever we create object of extended class,it recalls first the constructor of base classes

	}
}
