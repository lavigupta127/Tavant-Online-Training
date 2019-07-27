import java.util.*;
class Temp
{
	double c,f;
	public double faren(double c)
	{
		f=(double)(9*c/5+32);
		return f;
	}
	public double cels(double f)
	{
		c=(double)(5*(f-32.00)/9);
		return c;
	}
}
public class Temperature {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double f=s.nextDouble(),c=s.nextDouble();
		Temp t=new Temp();
		System.out.println(t.faren(c) + "\n" + t.cels(f));

		
	}
}
