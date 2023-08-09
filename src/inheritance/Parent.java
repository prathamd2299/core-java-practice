package inheritance; //hierarchical inheritance

public class Parent {
	public void car() //creation of car method
	{
		System.out.println("Car");
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.car(); //calling own method
//		obj.seatingCapacity();
//		obj.speed();
//		obj.transmission();
	}

}
