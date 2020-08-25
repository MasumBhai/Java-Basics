
///So,the concept of Encapsulation is
///binding data with methods
//To do it easily just press alt+insert  in intellij Idea and you will get Getter&Setter 
class Student {
	private int rollno;
	private String name;

	///actually,what we are doing is.Binding our variable data with our method.
    ///now one thing,always try to do is put the variable always private and access them with public/protected method
	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("MasumBhai");
        s1.setRollno(44);
		System.out.println(s1.getName() + "  :  " + s1.getRollno());
	}
}
//create class , type variable , press alt+insert , constructor  and  Getter&Setter boom
