package inheritance; //hierarchical inheritance

public class Hundai extends Cars {
	public void transmission() // creation of transmission method
	{
		System.out.println("Automatic transmission");
	}

	public static void main(String[] args) {
		Hundai car3 = new Hundai();
		car3.car(); // calling parent method
		car3.transmission(); // calling own method
//		car2.seatingCapacity(); calling another child class method
//		car2.speed(); calling another child class method
	}

}
