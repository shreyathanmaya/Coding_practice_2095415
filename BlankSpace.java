package Java;
public class BlankSpace 
{
	public static void main(String[] args)
	{
		String str = "   Cognizant  Technology    Solutions ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
