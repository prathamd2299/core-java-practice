package inheritance; //hierarchical inheritance

public class Kia extends Parent {
	public void speed() //creation of speed method
	{
		System.out.println("Max: 200kmph");
	}

	public static void main(String[] args) {
		Kia car2 = new Kia();
		car2.speed(); //calling own method
		car2.car(); //calling parent method
//		car2.seatingCapacity(); calling another child class method
//		car2.transmission(); calling another child class method
	}

}
