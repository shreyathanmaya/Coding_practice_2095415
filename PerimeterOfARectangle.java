package Java;
import java.io.*;
public class PerimeterOfARectangle 
{
		static void perimeter(int length, int breadth)
		{
			int perimeter = 2 * (length + breadth);
			System.out.println("The perimeter of the given rectangle with the length " + length + " and breadth is " + breadth + " = " + perimeter);
		}
		public static void main(String[] args)
		{
			int length = 20;
			int breadth = 40;
			perimeter(length, breadth);
		}	
}
