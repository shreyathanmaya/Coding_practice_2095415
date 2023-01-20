package Java;
import java.util.ArrayList;
import java.util.Iterator;
class hasNextMethod 
{
	public static void main(String[] args)
	{
			
		ArrayList<String> list = new ArrayList<String>();

		list.add("Cognizant");
		list.add("Java");

		Iterator<String> iterator = list.iterator();	
		System.out.println(iterator.hasNext());
		
		iterator.next();
		
		System.out.println(iterator.hasNext());
		
		iterator.next();
		
		System.out.println(iterator.hasNext());
	}
}
