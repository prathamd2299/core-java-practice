package abstraction;

public abstract class Parent {
	public abstract void M1();
	
	public abstract void M2();
	
	public void M3()
	{
		System.out.println("I am method 3");
	}
	
//	public static void main(String[] args) {
////		Parent p = new Parent(); we cannot create object in parent and call
//	}  
}
