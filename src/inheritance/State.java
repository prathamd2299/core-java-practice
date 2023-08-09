package inheritance; //method overriding concept

public class State extends India {
	public void city() //overriding method
	{
		System.out.println("Mumbai");
	}

	public static void main(String[] args) {
		State st = new State();
		st.city();
		st.state();

	}

}
