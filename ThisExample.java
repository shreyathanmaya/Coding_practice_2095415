package Java;

public class ThisExample
{
	int a;
	int b;
	
	ThisExample(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void display()
	{
		System.out.println("a = " +a+ "b = "+b);
	}
	public static void main(String[] args)
	{
		ThisExample object = new ThisExample(10, 20);
		object.display();
	}
}
