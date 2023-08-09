package inheritance;

class A {
	int a;
	void display()
	{
		System.out.println("A method called");
		System.out.println(a);
		System.out.println();
	}
}

class B extends A {
	int b;
	void print()
	{
		System.out.println("B method called");
		System.out.println(b);
		System.out.println();
	}
}

public class SingleInheritanceExample {

	public static void main(String[] args) {
		A aobj = new A(); //A object creation
		aobj.a = 100; //class A variable access by A
		aobj.display(); //class A method access by A
		
		B bobj = new B(); //B object creation
		bobj.a = 200; //class A variable by B
		bobj.b = 300; //class B variable access by B 
		bobj.display(); //class A method access by B
		bobj.print(); //class B method access by B

	}

}
