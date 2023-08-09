package inheritance; //hierarchical inheritance

public class Maruti extends Parent{
	public void seatingCapacity() //creation of seatingCapacity method
	{
		System.out.println("5 seater");
	}
	
	public static void main(String[] args) {
		Maruti car1 = new Maruti();
		car1.car(); //calling parent method
		car1.seatingCapacity(); //calling own method
//		car1.speed();
//		car1.transmission();
	}

}
