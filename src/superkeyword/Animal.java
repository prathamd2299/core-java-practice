package superkeyword;

public class Animal {
	String color = "white";
	// default or no-arg constructor
	  Animal() {
	    System.out.println("I am an animal");
	  }

	  // parameterized constructor
	  Animal(String type) {
	    System.out.println("Type: "+type);
	  }
	  
	  // overridden method
	  public void display(){
	    System.out.println("I am an animal method");
	  }
}


