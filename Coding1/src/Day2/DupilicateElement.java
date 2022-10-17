package Day2;

public class DupilicateElement {
	public static void main(String[] args)
	{
		int[] arr = new int[] {2,4,5,7,2};
		System.out.println("Duplicate elements in given list");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
				
			}
			
			
		}
		System.out.println("Duplicate element not present");
	}

}
