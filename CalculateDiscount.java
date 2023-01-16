package Java;
public class CalculateDiscount 
{
	public static void main(String args[])
	{
		double dis, amount, markedprice, s;
		markedprice = 1000;
		dis = 25;
		System.out.println("Markedprice= "+markedprice);
		System.out.println("Discount rate=  "+dis);
		s=100-dis;
		amount=(s*markedprice)/100;
		System.out.println("Amount after discount =  "+amount);
	}
}
