package Day3_Array_Problems;

public class ElementsInReverseOrder
{
	public static void main(String[]args)
	{
		int[] ar=new int[] {1, 5, 45, 435 , 87, 45 ,5, 3, 4};
		
		for (int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
