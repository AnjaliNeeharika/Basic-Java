package DefaultChecks;

public class Local1 {
	
	
	
	void check()
	{
		int t;  //The local variable t may not have been initialized
		String r; //The local variable r may not have been initialized
		float p; //The local variable p may not have been initialized
		boolean e; //The local variable e may not have been initialized
		char q; //The local variable q may not have been initialized
//		System.out.println("The int T value is : " +t);
//		System.out.println("The String R value is : " +r);
//		System.out.println("The Float P value is : " +p);
//		System.out.println("The Boolean E value is : " +e);
//		System.out.println("The Char Q value is : " +q);
	}
	

	public static void main(String[] args) {
		Local1  I = new Local1();
		I.check();

	}

}
