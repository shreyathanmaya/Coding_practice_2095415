package Java;
import java.util.*;

public class MapList 
{
	    public static void main(String[] args)
	    {
	    	Map<Integer, String> map = new HashMap<>();
	    	map.put(1, "a");
	    	map.put(2, "b");
	    	map.put(3, "c");
	    	map.put(1,  "d");
	    	
	    	List<Integer> keyList = new ArrayList(map.keySet());
	    	List<String> valueList = new ArrayList(map.values());
	    	
	    	System.out.println("Key List: " + keyList);
	    	System.out.println("Value List: "+ valueList);
	       

	    }

}
