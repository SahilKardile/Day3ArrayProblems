package Day3_Array_Problems;

public class ElementdOnEvenPosition 
{
	 public static void main(String[]args)
	 {
		 int[] ar=new int[] {1, 5, 45, 435 , 87, 45 ,5, 3, 4};
		 
		 for (int i=0; i<=ar.length-1; i=i+2)
		 {
			 System.out.println(ar[i]);
		 }
		 
		 
	 }

}
