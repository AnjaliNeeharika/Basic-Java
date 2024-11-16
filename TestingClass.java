package StaticPart2;

public class TestingClass {
	
	int stdid;
	String name;
	int contact;
	static String course;
	
	void data()
	{
		System.out.println("The Student Id is : " +stdid);
		System.out.println("The Stduent Name is : " +name);
		System.out.println("The Stduent Contact is : " +contact);
		System.out.println("The Stdudent opted for : " +course);
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("-----With Object T no values assigned----");
		TestingClass  T = new TestingClass();
		T.data();
		
		course = "Testing Tools";
		
		
		System.out.println("-------With Student T1-------");
		TestingClass  T1 = new TestingClass();
		T1.stdid = 90;
		T1.name = "guru";
		T1.contact = 998877;
		T1.data();
		
		
		System.out.println("-------With Student T2-------");
		TestingClass  T2 = new TestingClass();
		T2.stdid = 78;
		T2.name = "prasad";
		T2.contact = 112288;
		T2.data();
		
		System.out.println("-------With Student T3-------");
		TestingClass  T3 = new TestingClass();
		T3.stdid = 1000;
		T3.name = "uday";
		T3.contact = 987654;
		T3.data();
		
		
		System.out.println("---Here T2 student want to change to Java---");
		
		T2.course = "Java";
		
		System.out.println("---After T2 course change-------");
		
		T1.data();
		T2.data();
		T3.data();
		
		
		
		
		

	}

}
