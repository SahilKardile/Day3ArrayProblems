package Day3_Array_Problems;

public class AscendingOrderElements
{
	public static void main(String[]args)
	{
		 int[] ar=new int[] {1, 5, 2, 2, 5, 3, 4};
		 int temp=0;
		 
		 System.out.println("Elements of original Array");
		 for(int i=0; i<=ar.length-1; i++)
		 {
			 System.out.println(ar[i]+" ");
			 
		 }
		 
	     for(int i=0; i<=ar.length-1;  i++)
		    {
	    	 for(int j=i+1; j<=ar.length-1; j++)
	    	 {
	    		
	    		 if(ar[i]>ar[j])
	    		 {
	    			 temp=ar[i];
	    			 ar[i]=ar[j];
	    			 ar[j]=temp;
	    		 }
			 }
		    }
	     System.out.println();
	     
	     System.out.println("Elements of array sorted in ascending order: ");  
	     
	     for(int i=0; i<=ar.length-1; i++)
	     {
	    	 System.out.println(ar[i]+ " ");
	     }
	     
	     
	     
	     
	 }
	
}
	


