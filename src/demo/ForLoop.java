package demo;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10;i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\n"); //new line or gap between upper and lower print
		
		for(int i = 10; i >= 1; i--)
		{
			System.out.println(i);
		}
		System.out.println("\nWhile loop"); //new line or gap between upper and lower print
		
		int i =1; //initialization
		while(i <= 10) //condition check
		{
			System.out.print(i + " ");
			i++; //increment or decrement
		}
		System.out.println();
		System.out.println("\nDo while loop");
		int a = 5;
		do
		{
			System.out.print(a + " ");
			a++;
		} while(a <= 10);
	}

}
