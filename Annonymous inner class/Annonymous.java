
class A {
	public void show() {
		System.out.println("in A show");
	}
}

class B extends A {
	public void show(){
		System.out.println("in B show");
	}
	//so,what's purpose of this class ? we are just overriding the show method
}

public class Annonymous {

	public static void main(String[] args) {
		A object00 = new A() {
			public void show() {
				System.out.println("in B show");
			}
			//so,we are achiving B class here without creating name of the class And that's why it is called annonymous class
			//but this class is just for one time use,cause it's scoppe is limited
		};
		object00.show();
		
	}
}
