package inheritance; //multilevel inheritance

public class Maruti800 extends Maruti {
	public void model() // creation of subchild method
	{
		System.out.println("Model: 800");
	}

	public void seatingCapacity() // creation of subchild method
	{
		System.out.println("Seating capacity: 5");
	}

	public static void main(String[] args) {
		Maruti800 maruti = new Maruti800(); // creation of subchild object by using subchild class name
		maruti.brand(); // calling child property
		maruti.speed(); // calling child property
		maruti.country(); // calling parent property
		maruti.vehicleType(); // calling parent property
		maruti.model(); // calling subchild property
		maruti.seatingCapacity(); // calling subchild property

	}

}
