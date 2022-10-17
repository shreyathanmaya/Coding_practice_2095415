package Day2;

public class swap1 {
	public static void main(String[] ags)
	{
		float first = 1.20f, second = 2.45f;
		 System.out.println("--Beforen swap--");
		 System.out.println("First number = " + first);
		 System.out.println("Second number = " + second);
		 
		 float temporary = first;
		 
		 first = second;
		 
		 second = temporary;
		 
		 System.out.println("--After swap--");
		 System.out.println("First number = " + first);
		 System.out.println("Second number = " + second);
	}

}
