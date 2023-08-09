package demo;

public class Method {
	
	public void add(int x, double y) //creation of method add()
	{
		System.out.println(x + y);
	}
	
	public void add(int z) //method overloading add()
	{
		System.out.println(z);
	}
	
	public void sub() //creation of method sub()
	{
		System.out.println(50 - 20);
	}
	
	public void mul(double x, float y) //creation of method mul()
	{
		System.out.println(x * y);
	}
	
	public void sub(int b) //method overloading sub()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		Method obj  = new Method(); //creation of object
		obj.add(10, 20); //calling method add
		obj.sub(); //calling method sub
		obj.mul(25.0, 2.0f); //calling method mul
		obj.add(25);
		obj.sub('A');
	}

}
