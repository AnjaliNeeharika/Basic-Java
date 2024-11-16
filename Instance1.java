package DefaultChecks;

public class Instance1 {
	
	int t;
	String r;
	float p;
	boolean e;
	char q;
	
	void check()
	{
		System.out.println("The int T value is : " +t);
		System.out.println("The String R value is : " +r);
		System.out.println("The Float P value is : " +p);
		System.out.println("The Boolean E value is : " +e);
		System.out.println("The Char Q value is : " +q);
	}
	

	public static void main(String[] args) {
		Instance1  I = new Instance1();
		I.check();

	}

}
