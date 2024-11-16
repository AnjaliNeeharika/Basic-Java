package ConstructorTypes;

public class MyData {
	
	MyData()
	{
		System.out.println("Hai I am Default Constructor");				
	}
	
	MyData(int y, String s)
	{
		System.out.println("Hai I am a two Parameterised Constructor");
	}
	
	MyData(String s)
	{
		System.out.println("Hai I am a one Parameterised Constructor");
	}

	public static void main(String[] args) {
		new MyData(123, "Hai");
		
		new MyData(6473, "hello");
		
		new MyData(123, "Hai");

	}

}
