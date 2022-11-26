package Day3_Array_Problems;

public class LargestElementInArrays 
{
	public static void main(String[]args)
	{
		int[] ar=new int[] {100, 10, 85, 5, 90, 25};
		
		int max=ar[0];
		
		for(int i=0; i<=ar.length-1; i++)
		{
		   if(ar[i]>max)
		   {
			   max=ar[i];
		   }
	   
		}
		
		System.out.println("Largest element is "+ max);
	}

}
