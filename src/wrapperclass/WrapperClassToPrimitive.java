package wrapperclass;
//Java program to convert object into primitives  
//Unboxing example of Byte to byte 
//Unboxing example of Short to short
//Unboxing example of Integer to int
//Unboxing example of Long to long
//Unboxing example of Boolean to boolean
//Unboxing example of Character to char
//Unboxing example of Double to double
//Unboxing example of Float to float
public class WrapperClassToPrimitive {

	public static void main(String[] args) {
		
		// creates objects of wrapper class
		Byte byObj = Byte.valueOf("111"); 
		Short sObj = Short.valueOf("1526"); 
		Integer iObj = Integer.valueOf(23); 
		Long lObj = Long.valueOf(4563217); 
		Character cObj = Character.valueOf('j'); 
		Boolean boObj = Boolean.valueOf(false); 
		Float fObj = Float.valueOf(652.2f); 
		Double dObj = Double.valueOf(5.55);
		   
		// converts into primitive types 
		byte by = byObj.byteValue(); 
		short s = sObj.shortValue(); 
		int i = iObj.intValue(); 
		long l = lObj.longValue(); 
		char c = cObj.charValue(); 
		boolean bo = boObj.booleanValue(); 
		float f = fObj.floatValue(); 
		double d = dObj.doubleValue();
		  
		System.out.println("The value of byte: " + by);
		System.out.println("The value of short: " + s);
		System.out.println("The value of int: " + i);
		System.out.println("The value of long: " + l);
		System.out.println("The value of char: " + c);
		System.out.println("The value of boolean: " + bo);
		System.out.println("The value of float: " + f);
		System.out.println("The value of double: " + d);
		 

	/*	
		//Converting Byte to byte
		Byte by = new Byte("111");    
		byte  b = by.byteValue(); //converting Integer to byte explicitly  
		byte byTe = b; //unboxing, now compiler will write by.byteValue() internally
		System.out.println("Byte and byte Values are: ");
		System.out.println(by + " " + b + " " + byTe + "\n");
		
		//Converting Short to short
		Short sh = new Short("4587");    
		short s = sh.shortValue(); //converting Integer to short explicitly  
		short shOrt = s; //unboxing, now compiler will write sh.shortValue() internally
		System.out.println("Short and short Values are: ");
		System.out.println(sh + " " + s + " " + shOrt + "\n");
		
		
		//Converting Integer to int
		Integer a = new Integer(3);    
		int i=a.intValue(); //converting Integer to int explicitly  
		int j=a; //unboxing, now compiler will write a.intValue() internally
		System.out.println("Integer and int Values are: ");
		System.out.println(a + " " + i + " " + j + "\n");
		
		//Converting Long to long
		Long lo = new Long(45631189);
		long l = lo.longValue(); //converting Long to long explicitly
		long loNg = lo; //unboxing, now compiler will write lo.longValue() internally
		System.out.println("Long and long Values are: ");
		System.out.println(lo + " " + l + " " + loNg + "\n");
		
		//Converting Character to char
		Character ch = new Character('c');
		char c = ch.charValue(); //converting Float to float explicitly
		char chAr = ch; //unboxing, now compiler will write fl.floatValue() internally
		System.out.println("Character and char Values are: ");
		System.out.println(ch + " " + c + " " + chAr + "\n");
		
		//Converting Boolean to boolean
		Boolean bool = new Boolean(true);
		boolean boo = bool.booleanValue(); //converting Float to float explicitly
		boolean boolEan = bool; //unboxing, now compiler will write fl.floatValue() internally
		System.out.println("Boolean and boolean Values are: ");
		System.out.println(bool + " " + boo + " " + boolEan + "\n");
		
		//Converting Float to float
		Float fl = new Float(456.35f);
		float f = fl.floatValue(); //converting Float to float explicitly
		float floAt = fl; //unboxing, now compiler will write fl.floatValue() internally
		System.out.println("Float and float Values are: ");
		System.out.println(fl + " " + f + " " + floAt + "\n");
		 
		//Converting Double to double
		Double dob = new Double(986.65);
		double d = dob.doubleValue(); //converting Float to float explicitly
		double douBle = dob; //unboxing, now compiler will write fl.floatValue() internally
		System.out.println("Double and double Values are: ");
		System.out.println(dob + " " + d + " " + douBle + "\n");
	*/	
	}

}
