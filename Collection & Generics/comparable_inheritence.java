
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

class Student implements Comparable<Student> ///Comparable interface has only one method CompareTo
{
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student{" +
				"roll=" + roll +
				", name='" + name + '\'' +
				", marks=" + marks +
				'}';
	}

	public int compareTo(Student s) {
		return marks > s.marks ? 1 : -1;
	}
}

public class comparable_inheritence {

	public static void main(String[] args) {
		//actually we are creating ArrayList of Student class
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(26, "irteza", 80));
		studs.add(new Student(29, "Shobuz", 87));
		studs.add(new Student(17, "ibrahim", 85));
		studs.add(new Student(19, "Mostofa", 90));
		studs.add(new Student(51, "irteza", 97));

		for (Student s : studs) {
			System.out.println(s); //it will call the toString method
		}
		System.out.println("\nBut now i want to sort the elements according to marks");
		Collections.sort(studs);//this will show us error so we have to implement Comparable in our class

		for (Student s : studs) {
			System.out.println(s); //it will call the toString method
		}
	}
}
