package Day4;

public class Assignment1 {
	
	public void m1()
	{
		this.m4();
		System.out.println("Default method");
	}

	public void m2()
	{
		this.m1();
		System.out.println("One parameterised method");
	}
	
	public void m3()
	{
		this.m2();
		System.out.println("Two parameterised method");
	}
	
	public void m4()
	{
		System.out.println("Three parameterised method");
	}
	
	public void m5()
	{
		this.m3();
		System.out.println("Four parameterised method");
	}
	
	public static void main(String[] args) {
		
		Assignment1 ob = new Assignment1();
		ob.m5();
		
	}
}
