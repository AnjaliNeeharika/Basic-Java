package MethodTypes;

public class Car {
	
	int y = 90;  //instance variable
	static String n = "I20";
	
	void name()
	{
	  System.out.println("The Value of Y is : " +y);
	  System.out.println("The Car Name in non-static method is : " +n);
	}
		
	static void tyres()
	{
		System.out.println("The Car Name in static method is : " +n);
	}

	public static void main(String[] args) {
		Car C = new Car();
		C.name();
		tyres();

	}
	
	

}
