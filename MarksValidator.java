public class MarksValidator {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
		if(n<40)
		{
			System.out.println("Student is fail");
		}
		else
		{
			if(n>90)
				System.out.println("Grade is A");
			else if(n>75)
				System.out.println("Grade is B");
			else if(n>60)
				System.out.println("Grade is C");
			else
				System.out.println("Grade is D");
		}
	}
	
}
