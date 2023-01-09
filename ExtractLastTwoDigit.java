package Java;
import java.util.Scanner;
public class ExtractLastTwoDigit  
{
	 public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int res = 0;
		
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		
		res = year % 100;
		System.out.printf("Result is: %d", res);
	 }
}
