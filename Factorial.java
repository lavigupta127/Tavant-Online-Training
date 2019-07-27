import java.util.*;
public class Factorial {
	
	public int fact(int no){
		if(no >= 1)
		{
			return no*fact(no-1);
		}else {
			return 1;
		}
	}

	public static void main(String args[]) 
  {
		Factorial factorial = new Factorial();
		System.out.println("Enter any positive no : ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int result = factorial.fact(n);
		
		System.out.println("factorial of a given number is : " +result);
	}
}
