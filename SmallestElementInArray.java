package Day3_Array_Problems;

public class SmallestElementInArray 

{
   public static void main(String[]args)
   {
	 int[] ar = new int[] {4, 5, 578, 531, 1, 3};
	 
	 int min= ar[0];
	 
	 for(int i=0; i<=ar.length-1; i++)
	 {
		 if(ar[i]<min)
		 {
			 
			 min=ar[i];
			 
		 }
	 }
	 System.out.println("Smallest element is "+ min);
	   
	   
   }
}
