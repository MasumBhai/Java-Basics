
class A {
	public void show() {
		System.out.println("inside of A ");
	}
}

class B extends A {
    @Override
	public void show() {
		System.out.println("inside of B ");
	}

	public void conflict() {
		System.out.println("conflict arise...");
	}
}

class C extends A {
    @Override
	public void show() {
		System.out.println("inside of C ");
	}
}

public class Dynamic_method_dispatch {

	public static void main(String[] args) {
		System.out.println("****************************");
		//now,here occurs runtime polymorphism(method overriding)
		A obj1 = new B();//So,what does it actually mean?
		obj1.show();
		//it will not work cause conflict() method doesn't exixt in class A
		// obj1.conflict();
		obj1 = new C();
		obj1.show();
		//for the run time polymorphism,here occurs 'Dynamic method dispatch'
	}
}
