package oops;

public class Student {
	int sid;
	String sname;
	char grade;

	// we can assign values to variables by using method
	Student(int id, String name, char g) {
		sid = id;
		sname = name;
		grade = g;
	}

	// we can assign values to variables by using method
	void getValues(int id, String name, char g) {
		sid = id;
		sname = name;
		grade = g;
	}

	// this method is to display the values
	void dispaly() {
		System.out.println("Student id is: " + sid);
		System.out.println("Student name is: " + sname);
		System.out.println("Student grade is: " + grade + "\n");
	}

}
