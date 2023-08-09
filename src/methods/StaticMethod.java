package methods;

public class StaticMethod {
	static int a = 10; //static variable
	int b = 20; //non-static variable
	
	//constructor
	StaticMethod()
	{
		System.out.println("Constructor " + a + "\n"); //static variable can access in constructor
	}
	
	//static method
	static void M1()
	{
		System.out.println("I am static method");
		System.out.println("Static method " + a + "\n"); //static variable can access any static method
	}
	
	//non-static method
	void M2()
	{
		System.out.println("Non static method " + a + "\n"); //static variable can access any non static method		
	}
	
	//non-static method
	void M3()
	{
		System.out.println(a); //non static method can access static variable
		System.out.println(b); //non static method can access non-static variable
		M1(); //non static method can call static method
		M2(); //non static method can call non-static method
	}
	
	//main method
	public static void main(String[] args) {
		StaticMethod stm = new StaticMethod();
		stm.M2(); //non-static method can call by creating object and object reference
		M1(); //static methods can call directly without object reference
		System.out.println("Main method " + a + "\n"); //static variable can access main method
		System.out.println(stm.b + "\n"); //non static variable can access through object reference
		stm.M3();
	}

}
