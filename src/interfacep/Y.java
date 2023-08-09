package interfacep;

public class Y implements X {
	public void M1()
	{
		System.out.println("Implementation for M1");
	}
	
	public void M2()
	{
		System.out.println("Implementation for M2");
	}
	
	public void M3()
	{
		System.out.println("Implementation for M3");
	}
	
	public static void main(String[] args) {
		Y obj = new Y();
		obj.M1();
		obj.M2();
		obj.M3();
	}

}
