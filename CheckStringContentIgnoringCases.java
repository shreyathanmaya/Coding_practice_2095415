public class CheckStringContentIgnoringCases
{
	
	    public static void main(String[] args)
	    {
	 
	       String firstString = "My Name Is Thanmaya";
	       String secondString = "my name is thanmaya";
	       
	       System.out.println("Checking using equals method: " +firstString.equals(secondString));
	       
	       System.out.println("Checking using equalsIgnoreCase method: " + firstString.equalsIgnoreCase(secondString));
	    }
	 
}


