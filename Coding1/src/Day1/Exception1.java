package Day1;


public class Exception1
{
	public static void main(String[] args)
	{
		try
		{
			int[] myNumbers = {1,2,3,4,5,6,7,8,9,10,11};
			System.out.println(myNumbers[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("The try-catch is finished");
		}
	}

}
