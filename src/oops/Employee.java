package oops;

public class Employee {
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	public void display()
	{
		System.out.println("Employee id is: " + eid);
		System.out.println("Employee name is: " +ename);
		System.out.println("Employee salary is: " +sal);
		System.out.println("Employee department number is: " +deptno);
		System.out.println("Employee job is: " +job);
		System.out.println("\n");
	}
	//main method can be present in same class
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.eid = 1;
		emp.ename = "Prathamesh";
		emp.sal = 50000;
		emp.deptno = 10;
		emp.job = "QA";
		emp.display();
		
		Employee emp1 = new Employee();
		emp1.eid = 2;
		emp1.ename = "Anant";
		emp1.sal = 80000;
		emp1.deptno = 12;
		emp1.job = "Automation Tester";
		emp1.display();
	}

}
