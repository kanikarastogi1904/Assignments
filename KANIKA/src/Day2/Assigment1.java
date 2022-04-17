package Day2;

public class Assigment1 {
	
	public int add (int a, int b)
	
	{
		int c=a+b;
		return c;
		
	}

	public int sub(int x, int y)
	
	{
		int z=x-y;
		return z;
	}
	
	public int multi (int g, int h)
	
	{
		int k=g*h;
		return k;
	}
	
	public void div (int n, int m)
	
	{
		int l =n/m;
		System.out.println("Final result is " + l);
		
	}
	
	public static void main(String[] args) {
		
		Assigment1 ob=new Assigment1();
		int sumresult = ob.add(10,2);
		int subresult = ob.sub(sumresult, 2);
		int sumresult2 = ob.add(subresult,2);
		int multiresult = ob.multi(sumresult2, 2);
		ob.div(multiresult, 2);
		
		
	}
}


