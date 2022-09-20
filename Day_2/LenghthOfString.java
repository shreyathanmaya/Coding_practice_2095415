package Day_2;

class LenghthOfString
{
	public static void main(String args[])
	{
		String BFS="Banking and financial services";
		System.out.println("length of BFS string :"+getLengthOfStringWithCharArray("Banking and finanacial services"));
	}
	public static int getLengthOfStringWithCharArray(String str)
	{
		int length=0;
		char[] strCharArray=str.toCharArray();
		for(char c:strCharArray)
		{
			length++;
		}
		return length;
	}

}
