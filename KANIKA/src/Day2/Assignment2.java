package Day2;

public class Assignment2 {
	
	public int add (int a, int b)
	
	{
		int c= a+b;
		return c;
		
	}

	public int sub(int x, int y)
	
	{
		int z= x-y;
		return z;
		
	}

	public int multi (int n, int m)
	
	{
		int l=n*m;
		return l;
		
	}
	
	public void div (int r, int t)
	
	{
		int s=r/t;
		System.out.println("Final result is "+s);
	}

	public static void main(String[] args) {
		
		Assignment2 ob= new Assignment2();
		int multiresult=ob.multi(10,2);
		int sumresult = ob.add(multiresult, 2);
		int subresult=ob.sub(sumresult, 2);
		int subresult2=ob.sub(subresult, 2);
		int sumresult2=ob.add(subresult2, 2);
		ob.div(sumresult2, 2);
		
		
		
		
	}
}


