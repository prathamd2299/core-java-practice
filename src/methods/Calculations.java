package methods;

public class Calculations {
	int x = 80;
	int y = 60;

	// Case1 - not taking any parameters and not return any value
	void sum() {
		System.out.println("Sum of " + x + " + " + y + " = " + (x + y));
	}

	// Case2 - not taking parameters but return a value
	int sub() {
		return (x - y);
	}

	// Case3 - taking parameters but not return any value
	void mul(int a, int b) {
		System.out.println("Multiplication of " + a + " * " + b + " = " + (a * b));
	}

	// Case4 - taking parameters and return a value
	double div(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {
		Calculations cal = new Calculations();
		// sum method
		cal.sum();

		// subtraction method
		int res = cal.sub();
		System.out.println("Substraction of " + 80 + " - " + 60 + " = " + res);
		System.out.println("Substraction of " + 80 + " - " + 60 + " = " + cal.sub());

		// multiplication method
		cal.mul(5, 4);

		// division method
		double result = cal.div(22, 12);
		System.out.println("Division of " + 22 + " / " + 12 + " = " + result);
		System.out.println("Division of " + 80 + " / " + 6 + " = " + cal.div(80, 6));
	}
}
