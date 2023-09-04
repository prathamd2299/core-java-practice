package oops;

public class StudentMain {
	// main method can be present in separate class
	public static void main(String[] args) {
		Student std = new Student(3, "Sharad", 'C');
		std.dispaly();
		// we can assign values to variables by using object reference variable
		/*
		 * std.sid = 1; std.sname = "Prathamesh"; std.grade = 'A'; std.dispaly();
		 */
		// we can assign values to variables by using method
		/*
		 * std.getValues(2, "Anant", 'B'); std.dispaly();
		 */
	}

}
