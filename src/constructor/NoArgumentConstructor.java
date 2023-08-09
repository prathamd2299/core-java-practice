package constructor;

public class NoArgumentConstructor {
	int x;
	int y;
	
	//no argument constructor
	NoArgumentConstructor() 
	{
		x = 15;
		y = 56;
		System.out.println("Constructor is called");
	}
	
	void display()
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		NoArgumentConstructor dc = new NoArgumentConstructor(); //invokes no argument constructor
		dc.display();

	}

}
