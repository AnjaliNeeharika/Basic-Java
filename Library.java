package Constructors;

public class Library {
	
	Library()
	{
		
		  System.out.println("Hai I am a BOOK Constructor");
		  m1();
	}
	
	void m1()
	{
		System.out.println("Hai I am a M1 method");
	}

	public static void main(String[] args) {
		Library L =	 new Library();   //object created
		L.m1();
		L.m1();
		L.m1();
		L.m1();
		L.m1();
		L.m1();
		L.m1();
		L.m1();
		
		
		
	}

}
