package Java;
import java.util.HashSet;
import java.util.Set;


public class TwoSets
{
	  public static void main(String[] args)
	  {

		    Set<Integer> numbers = new HashSet<>();
		    numbers.add(1);
		    numbers.add(11);
		    numbers.add(13);
		    numbers.add(19);
		    System.out.println("Numbers: " + numbers);
	
		    Set<Integer> primeNumbers = new HashSet<>();
		    primeNumbers.add(11);
		    primeNumbers.add(19);
		    System.out.println("Prime Numbers: " + primeNumbers);
	
		    numbers.removeAll(primeNumbers);
		    System.out.println("Numbers without prime numbers: " + numbers);
	  }

}
