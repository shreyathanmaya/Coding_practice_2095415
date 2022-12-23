package Java;

public class ExecutionTime
{	
	  public void display()
	  {
	    System.out.println("Calculating Method execution time:");
	  }	  
	  public static void main(String[] args)
	  {	   
		  ExecutionTime obj = new ExecutionTime();	   
		  long start = System.nanoTime();	   
		  obj.display();
		  long end = System.nanoTime();
	      long execution = end - start;
		  System.out.println("Execution time: " + execution + " nanoseconds");
	  }	
}
