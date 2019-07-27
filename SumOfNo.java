import java.util.*;

public class SumOfNo {
	
	public int sumOfEven(int a, int b) {
		int sum=0;
		for(int i=a ; i<=b ;i++)
		{
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}
	 
	public int sumOfOdd(int a, int b) {
		int sum1=0;
		for(int i=a ; i<=b ;i++)
		{
			if(i%2!=0){
				sum1+=i;
			}
		}
		return sum1;
	}

	public static void main(String[] args) {
		SumOfNo sumof = new SumOfNo();
		System.out.println("Enter the start value : ");
		Scanner a = new Scanner(System.in);
		int start = a.nextInt();
		System.out.println("Enter the end value : ");
		int end = a.nextInt();
		
		int evensum = sumof.sumOfEven(start,end);
		int oddsum=sumof.sumOfOdd(start,end);
		
		System.out.println("Sum of Even no. between given range is :" + evensum);
		System.out.println("Sum of odd no. between given range is :" + oddsum);
	}

}
