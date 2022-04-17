package Day3;

public class Assignment {
	
	public Assignment()
	
	{
		this(10,2,3);
		System.out.println("Default Constructor");
		
	}
	
	public Assignment (int a)
	{
		this(10,2,3,4);
		System.out.println("One Parameterised Constructor");
	}
	
	public Assignment (int a, int b)
	
	{
		this();
		System.out.println("Two Parameterised Constructor");
	}

	public Assignment (int a, int b, int c)
	
	{
		
		System.out.println("Three parameterised Constructor");
	}
	
	public Assignment (int a, int b, int c, int d)
	
	{
		this(10,2);
		System.out.println("Four parameterised Constructor");
	}
	
	public static void main(String[] args) {
		
		Assignment ob=new Assignment(1);
	}
}
