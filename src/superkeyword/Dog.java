package superkeyword;

public class Dog extends Animal {
	String color = "black";
	

	  // default or no-arg constructor of class Dog
	  Dog() {

	    // calling default constructor of the superclass
	    //super();
	    super("Animal");

	    System.out.println("I am a dog constructor");
	  }
	
	  // overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a dog method");
	  }

	  public void printMessage(){

	    // this calls overriding method
	    display();

	    // this calls overridden method
	    super.display();
	  }
	  
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println();
//		Dog d1 = new Dog();
		d.printMessage();
	}

}
