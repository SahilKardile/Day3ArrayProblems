package Day3_Array_Problems;

public class DuplicateElementsInArray 
{
	public static void main(String[]args)
	{
		 int[] ar=new int[] {1, 5, 2, 2, 5, 3, 4};
		 
		 for(int i=0; i<=ar.length-1; i++)
		 {
			 
			 for(int a= i+1; a<=ar.length-1; a++)
				 
				 
			  if(ar[i]==ar[a])
				  System.out.println(ar[a]);
			 
			 
		 }
		 
	}
	

}
