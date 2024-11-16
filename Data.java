package StaticCaseStudty;

public class Data {
	
	static String name = "Meow";
	

	public static void main(String[] args) {
		System.out.println("Direct access - The Cat says : " +name); //accessing directly without object

		Data D = new Data();
		System.out.println("With Object - The Cat says : " +D.name );
		
		System.out.println("With class name - The Cat says : " +Data.name);
	
	}

}
