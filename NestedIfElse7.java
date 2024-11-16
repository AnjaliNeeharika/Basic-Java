package NestedIfElse;

public class NestedIfElse7 {
	public static void main(String[] args) {
		int marks = 9;
		if(marks>35 || marks<=50 )
		{
			System.out.println("Student Just Passed");
		}
		else if(marks>50 && marks<=60)
			{
				System.out.println("Student got Second Class");
			}
			else if(marks>60 && marks<90)
				{
					System.out.println("Student got First Class");
				}
				else if(marks>=90)
					{
						System.out.println("Student got Distinction");
					}
					else 
						{
							System.out.println("Student got Failed");
						}
	}

}
