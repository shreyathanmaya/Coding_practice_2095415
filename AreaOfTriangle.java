package Java;
import java.util.Scanner;
class AreaOfTriangle 
{
	public static void main(String args[]) 
	{  
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the width of the triangle");
		double b = s.nextDouble();
		System.out.println("Enter the height of the triangle");
		double h = s.nextDouble();
		double area = (b*h)/2;
		System.out.println("Area of triangle is: " +area);
	}
}