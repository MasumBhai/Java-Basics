//  ()  -> is for function or method
//  {}  -> is for class definition or method definition
//  []  -> is for array
//  <>  -> is for Generics
import java.lang.*;
import java.io.*;
import java.util.*;



public class List_Collection {
public static final int MAXX = 100;

    public static void main(String[] args) {
    int arr[] = new int[MAXX];
    Collection<Integer> value = new ArrayList();
   value.add(98);
    value.add(49);
    //we can use iterator to iterate over elements
    Iterator it = value.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
	    System.out.println("***********************************");
    //and also we can iterate using for each loop
	    for (Integer x : value) {
		    System.out.println(x);
	    }

        //collection does not work with the index number but List works with index number
        List<Integer> myarray = new ArrayList<Integer>();   //focus,how we declare on it
	    myarray.add(34);
	    myarray.add(17);
	    myarray.add(52);
	    myarray.add(26);
	    myarray.add(39);
	    System.out.println("original values :");
	    for (Integer x : myarray) {
		    System.out.println(x);
	    }
	    System.out.println("After sorting :");
	    Collections.sort(myarray);
	    for (Integer x : myarray) {
		    System.out.println(x);
	    }
	    System.out.println("the reverse sort will be:");
	    Collections.reverse(myarray);
	    for (Integer x : myarray) {
		    System.out.println(x);
	    }
	    System.out.println("After Shuffeling:");
	    Collections.shuffle(myarray);
	    for (Integer x : myarray) {
		    System.out.println(x);
	    }
	    ///but i want to compare & sort the value by the last index number of the elements
        Comparator<Integer> cmp = new Comparator<Integer>() {
	        @Override
	        public int compare(Integer i, Integer j) {
		        if(i%10 > j%10) return 1; //it actualy means when to swap
		        else return -1;
	        }
        };
		//now if we sort then it will print according to our desire
	    System.out.println("After changing comparator: (focus on the last digit)");
	    Collections.sort(myarray,cmp);
	    for (Integer x : myarray) {
		    System.out.println(x);
	    }
	    //we can also do this using annonymous class at the time of calling sorting
    }
}
