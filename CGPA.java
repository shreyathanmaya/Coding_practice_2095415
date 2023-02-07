package Java;
public class CGPA 
{
		public static double Calculate_CGPA(double[] marks, int number)
		{
			double grade[] = new double[number];
			double cgpa, sum = 0;
			for (int i = 0; i < number; i++) 
			{
				grade[i] = (marks[i] / 10);
			}
			
			for (int i = 0; i < number; i++) 
			{
				sum += grade[i];
			}
			cgpa = sum / number;
			return cgpa;
		}
	    public static void main(String args[])
		{
			int number = 5;
			double[] marks= { 90, 80, 80, 80, 90 };
			double cgpa = Calculate_CGPA(marks, number);
			System.out.println("CGPA = " + cgpa);
			
			System.out.println("CGPA Percentage = "+ String.format("%.2f", cgpa * 9.5));
		}

}
