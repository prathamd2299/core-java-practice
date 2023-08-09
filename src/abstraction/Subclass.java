package abstraction;

public class Subclass extends Abstract  {
	public void M1()
	{
		System.out.println("I am m1 method");
	}
	public void M2()
	{
		System.out.println("I am m2 method");
	}
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.M1();
		obj.M2();
		
	}

}
