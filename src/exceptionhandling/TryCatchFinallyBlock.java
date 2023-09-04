package exceptionhandling;

public class TryCatchFinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("I handle the exception");
		} finally {
			System.out.println("I am finally block");
		}
	}
}
