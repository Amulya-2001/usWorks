package Exception.practice;

public class FinallyDemo {

	public static void main(String args[])
	{
		int x, y;
		try
		{
			x = 0;
			y= 1/ x;
			System.out.println("This will not be printed.");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Division by zero.");
		}
		finally
		{
			System.out.println("End of Try/Catch Block");
		}
	}

}
