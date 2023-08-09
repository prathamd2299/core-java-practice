package com.facebook.www; //multilevel inheritance

public class Maruti extends Car {
	public void brand() //creation of child method
	{
		System.out.println("Brand: Maruti");
	}
	
	public void speed() //creation of child method
	{
		System.out.println("Max: 180kmph");
	}

	public static void main(String[] args) {
		Maruti car1 = new Maruti(); //creation of child object by using child class name
		car1.vehicleType(); //calling parent property
		car1.country(); //calling parent property
	}

}
