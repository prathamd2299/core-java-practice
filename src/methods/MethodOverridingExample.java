package methods;

class Bank {
	double rateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	double rateOfInterest() {
		return 2.5;
	}
}

class Icici extends Sbi {
	double rateOfInterest() {
		return 4.3;
	}
}

class Bob extends Icici {
	double rateOfinterest() {
		return 5.2;
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Bank class " + b.rateOfInterest());

		Sbi sb = new Sbi();
		System.out.println("Sbi class " + sb.rateOfInterest());

		Icici ic = new Icici();
		System.out.println("Icici class " + ic.rateOfInterest());

		Bob bo = new Bob();
		System.out.println("Bob class " + bo.rateOfinterest());

	}

}
