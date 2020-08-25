
class Calculator    //super,parent,Base
{
	public int add(int... n) {
		int s = 0;
		for (int k : n)
			s += k;
		return s;
	}
}

class CalculatorAdvance extends Calculator //sub-class,child,derived
{
	public int add(int i, int j) {
		return i + j;
	}

	public int multiple(int i, int j) {
		return i * j;
	}
}

class VeryAdvancedCalcalulator extends CalculatorAdvance {
	public int Multiply(int... n) {
		int s = 1;
		for (int k : n) {
			s *= k;
		}
		return s;
	}
}

public class inheritenceDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int result = c1.add(5, 4, 4, 3, 9);
		System.out.println(result);
		CalculatorAdvance c2 = new CalculatorAdvance();
		result = c2.add(4, 6, 49, 78);
		System.out.println(result);

		VeryAdvancedCalcalulator obj = new VeryAdvancedCalcalulator();
		//now we will access add,multiple,Multiply method from this
		System.out.println(obj.add(4, 9));
		System.out.println(obj.multiple(4, 9));
		System.out.println(obj.add(4, 9, 89, 15, 78, 39));
		System.out.println(obj.Multiply(4, 9, 89, 15, 78, 39));

	}
}
