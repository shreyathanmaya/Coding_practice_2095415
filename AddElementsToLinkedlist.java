package Java;
import java.util.LinkedList;
public class AddElementsToLinkedlist
{
	  public static void main(String[] args)
	  {
	    LinkedList<String> languages = new LinkedList<>();
	    
	    languages.add("Python");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: "+languages);
	    
	    languages.add(0, "Java");
	    System.out.println("Updated LinkedList: "+languages);
	  }

}
