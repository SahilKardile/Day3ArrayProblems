package Day3_Array_Problems;

public class ElementsOnOddPosition 
{
	 public static void main(String[]args)
	 {
		 int[] ad=new int[] {1, 5, 56, 53,4 , 354, 3543 ,43514, 5};
		 
		 for(int i=1; i<=ad.length-1; i=i+2)
		 {
			 System.out.println(ad[i]);
		 }
		 
		 
	 }

}
