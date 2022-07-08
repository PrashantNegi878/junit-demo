

public class calculator {
	
	public static void main(String[] args)
	{
		calculator c= new calculator();
		int a=c.add(10, 20);
		System.out.println(10+" + "+20+" = "+a);
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	

}
