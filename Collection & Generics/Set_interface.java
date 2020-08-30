
import java.util.*;
public class Set_interface {

	public static void main(String[] args) {

		Set<Integer> myset = new HashSet<>();
		myset.add(68);
		myset.add(96);
		myset.add(88);
		myset.add(69);
		myset.add(35);
		myset.add(29);

		for(int i : myset)
		{
			System.out.println(i);
		}
		System.out.println(" why that output??");
		System.out.println("cause,set only gives unique elements and hashSet only provide elements which is near to his heap memory\n" +
				"So HashSet doesn't follow sequence But if we want to get sequential elements Then we have to use TreeSet instead of HashSet");
		System.out.println("if we add again the same elements in our set,will it add??");
		System.out.println(myset.add(68));
		System.out.println(myset.add(96));
		System.out.println(myset.add(44));
		System.out.println(myset.add(69));
		System.out.println(myset.add(35));
		System.out.println(myset.add(29));
	}
}
