package NestedIfPack;

public class NestedIfPack2 {

	public static void main(String[] args) {
		int x = 151; 
		int y = 133;
		int z = 123;
		
		if(x<z)
		{
			System.out.println("Z is more than X");
			   if(z>y)
			   {
				   System.out.println("Y is less than Z");
				     if(x>y)
				     {
				    	 System.out.println("X is more than Y");
				     }
			   }
		}

	}

}
