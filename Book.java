package Constructors;

public class Book {
	
	Book()
	{
		
		  System.out.println("Hai I am a BOOK Constructor");
		  
	}
	
	void m1()
	{
		System.out.println("Hai I am a M1 method");
	}

	public static void main(String[] args) {
		Book B =  new Book();   //object created
		B.m1();
	}

}
