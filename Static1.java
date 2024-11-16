package DefaultChecks;

public class Static1 {
	
	
	static int t;
	static  String r;
	static float p;
	static boolean e;
	static char q;
	
	
   
	public static void main(String[] args) {
		Static1  I = new Static1();
		I.check();

	}
	
	void check()
	{
		System.out.println("The int T value is : " +t);
		System.out.println("The String R value is : " +r);
		System.out.println("The Float P value is : " +p);
		System.out.println("The Boolean E value is : " +e);
		System.out.println("The Char Q value is : " +q);
	}

}
