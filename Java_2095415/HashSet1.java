package Java;

// Import the HashSet class
import java.util.HashSet;


public class HashSet1 {
	
	//Even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
	  public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	  }

}
