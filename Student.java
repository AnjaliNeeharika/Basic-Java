package ClassVsObject;

public class Student {
	
	void bad()
	{
		System.out.println("Hai I am Bad Method");
	}

	public static void main(String[] args) {
		
		   Student R = new Student();
		   R.good();  //calls the Good method
		   System.out.println("Hai i am human");
		   R.bad();   //calls the Bad method
		   
		  
		   
		   

	}
	
	void good()
	{
		System.out.println("Hai I am Good Method");
	}

}
