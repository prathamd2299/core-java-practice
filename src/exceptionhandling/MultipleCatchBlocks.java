package exceptionhandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try
		{
			System.out.println(10 / 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("I handle the exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("I am arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("I am array index out of bound exception");
		}

	}

}
