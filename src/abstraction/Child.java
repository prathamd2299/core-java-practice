package abstraction;

public class Child extends Parent {
	public void M1() {
		System.out.println("I am inmplemented");
	}

	public void M2() {
		System.out.println("I am also implemented");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.M1();
		c.M2();
		c.M3();
	}

}
