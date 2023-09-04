package wrapperclass;

//Java program to convert primitive into objects  
//Autoboxing example of byte to Byte
//Autoboxing example of short to Short
//Autoboxing example of int to Integer
//Autoboxing example of long to Long
//Autoboxing example of boolean to Boolean
//Autoboxing example of char to Character
//Autoboxing example of double to Double
//Autoboxing example of float to Float  
public class PrimitiveToWrapperClass {

	public static void main(String[] args) {
		// Converting byte into Byte
		byte b = 111;
		Byte by = Byte.valueOf(b);// converting byte into Byte explicitly
		Byte byt = b;// autoboxing, now compiler will write Byte.valueOf(b) internally
		System.out.println("byte and Byte Values are: ");
		System.out.println(b + " " + by + " " + byt + "\n");

		// Converting short into Short
		short s = 555;
		Short sh = Short.valueOf(s); // converting short into Short explicitly
		Short shoRt = s; // autoboxing, now compiler will write Short.valueOf(s) internally
		System.out.println("short and Short Values are: ");
		System.out.println(s + " " + sh + " " + shoRt + "\n");

		// Converting int into Integer
		int a = 60;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println("int and Integer Values are: ");
		System.out.println(a + " " + i + " " + j + "\n");

		// Converting long into Long
		long l = 12005463;
		Long lo = Long.valueOf(l); // converting long into Long explicitly
		Long loNg = l; // autoboxing, now compiler will write Long.valueOf(l) internally
		System.out.println("long and Long Values are: ");
		System.out.println(l + " " + lo + " " + loNg + "\n");

		// Converting char into Character
		char c = 'g';
		Character ch = Character.valueOf(c); // converting char into Character explicitly
		Character chAr = c; // autoboxing, now compiler will write Character.valueOf(c) internally
		System.out.println("char and Character Values are: ");
		System.out.println(c + " " + ch + " " + chAr + "\n");

		// Converting boolean into Boolean
		boolean bo = true;
		Boolean bool = Boolean.valueOf(bo); // converting boolean into Boolean explicitly
		Boolean boolEan = bo; // autoboxing, now compiler will write Boolean.valueOf(bo) internally
		System.out.println("boolean and Boolean Values are: ");
		System.out.println(bo + " " + bool + " " + boolEan + "\n");

		// Converting float into Float
		float f = 15.2f;
		Float fl = Float.valueOf(f); // converting float into Float explicitly
		Float floAt = f; // autoboxing, now compiler will write Float.valueOf(f) internally
		System.out.println("float and Float Values are: ");
		System.out.println(f + " " + fl + " " + floAt + "\n");

		// Converting double into Double
		double d = 2564.56;
		Double doub = Double.valueOf(d); // converting double into Double explicitly
		Double douBle = d; // autoboxing, now compiler will write Double.valueOf(d) internally
		System.out.println("double and Double Values are: ");
		System.out.println(d + " " + doub + " " + douBle);
	}

}
