
import java.io.BufferedReader;
import java.io.InputStreamReader; //don't need to remeber these , just use import java.io.*;    (simple solution!)

//BufferedRedaer can only read String but Scanner can read both String and other data types like int, float, long, double, float etc
// if you are reading long String from a file, you should use BufferedReader but for short input and input other than String, you can use Scanner class.
//Scanner has nextInt(), nextLong(), nextShort(), nextFloat(), and nextDouble() methods, while BufferedReader  can only read and store String using readLine() method.
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		int a;
		try {
			a = 15;
			System.out.println(a);
			InputStreamReader read = new InputStreamReader(System.in);
			br = new BufferedReader(read); //to pass value in Bufferedreader() we have to pass object , so here i need inputStream object
			String str = "";
			System.out.println("until you write stop this process will continue...");
			while (!str.equals("stop")) {
				System.out.println("Enter data : ");
				str = br.readLine(); //readline() gives us in string format
				if(str == "stop"){break;}
				if(str != "stop") {
					//int div = Integer.parseInt(str);
					System.out.println("output of data : " + str);
				}
			}
			System.out.println("write your name : ");
			String str2 = br.readLine();
			System.out.println("you " + str2);

		} catch (ArithmeticException e) {
			System.out.println("Error is : " + e);
		} catch (Exception e) ///always put the Exception in last before finally block
		{
			System.out.println("Error is : " + e);
		} finally {
			System.out.println("you can be anything in your kingdom");
			//br.close();//here we have to buffered reader
		}
		//it's not necessary to write catch and finally block in java,we can do that in try block  it's called try with resource
		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("write an integer : ");
			int n = Integer.parseInt(br2.readLine());
			a = 100 / n;
		}
		System.out.println("result : "+ a);
	}
}
