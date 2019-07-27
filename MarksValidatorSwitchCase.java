import java.util.Scanner;
public class MarksValidatorSwitchCase {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		if(n>90)
			c=1;
		else if(n>75)
			c=2;
		else if(n>60)
			c=3;
		else if(n>=40)
			c=4;
		switch(c)
		{
		case 1:
			System.out.println("Grade is A");
		break;
		
		case 2:
			System.out.println("Grade is B");
		break;
		case 3:
		System.out.println("Grade is C");
		break;
		case 4:
			System.out.println("Grade is D");
		break;
		default:
		System.out.println("Fail");
		}
	}
}

