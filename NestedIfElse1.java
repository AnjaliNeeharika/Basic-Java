package NestedIfElse;

public class NestedIfElse1 {

	public static void main(String[] args) {
		int marks = 98;
		if(marks>35)
		{
			System.out.println("Student Just Passed");
		}

		if(marks>50)
		{
			System.out.println("Student got Second Class");
		}
		
		if(marks>60)
		{
			System.out.println("Student got First Class");
		}
		if(marks>90)
		{
			System.out.println("Student got Distinction");
		}
		if(marks<35)
		{
			System.out.println("Student got Failed");
		}
	}

}
