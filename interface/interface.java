
//so,we will create a class
interface Writer {
	public abstract void write();
	void show();
//this class is doing nothing So, we can make it abstruct

}

class Pen implements Writer {
	public void write() {
		System.out.println("inside of pen");
	}
}

class Pencil implements Writer {
	public void write() {
		System.out.println("inside of pencil");
	}
}

class Kit {
	public void doSomething(Writer p) {
		p.write();
	}
}

public class interface {

	public static void main(String[] args) {
		Kit obj_of_kit = new Kit();
		Pen pen = new Pen();
		obj_of_kit.doSomething(pen);
//		//now i want to pass object of pencil
//		Pencil p = new Pencil();
//		obj_of_kit.doSomething(p);
//		//but it will show error,so we will create a class "writer" and extend to pen and pencil class
//      //and the method
		Writer obj_of_writer01 = new Pen();     //what does it mean?we are creating reference of our "Writer" class not object
		Writer obj_of_writer02 = new Pencil();

		obj_of_kit.doSomething(obj_of_writer01);
		obj_of_kit.doSomething(obj_of_writer02);

	}
}
