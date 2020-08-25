public class outerClass
{
	public void show()
	{
		System.out.println("inside of outer class show()");
	}
	static class Inner
	{
		public void display()
		{
			System.out.println("inside inner class Display()");//to call it we have to create object of inner class

		}
	}
}
