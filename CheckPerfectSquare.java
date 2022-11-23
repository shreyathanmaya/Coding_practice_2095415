import java.util.Scanner;  
public class CheckPerfectSquare 
{   
	static boolean checkPerfectSquare(double number)    
	{   
		 double sqrt = Math.sqrt(number);
		 return ((sqrt - Math.floor(sqrt)) == 0);
	}   
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		if(checkPerfectSquare(number))
		System.out.println("Yes, the given number is perfect square");
		else
		System.out.println("No, the given number is not perfect square");
	}
}   