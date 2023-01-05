package Java;
import java.util.HashSet;
import java.util.Set;
public class UnionOfTwoSets
{
	  public static void main(String[] args) 
	  {
		  Set<Integer> num = new HashSet<>();
		  num.add(2);
		  num.add(4);
		  System.out.println("Set1: " +num);
		  
		  Set<Integer> numbers = new HashSet<>();
		  numbers.add(1);
		  numbers.add(3);
		  System.out.println("Set2: " +numbers);
		  
		  numbers.addAll(num);
		  System.out.println("Union is: " +numbers);


	  }

}
