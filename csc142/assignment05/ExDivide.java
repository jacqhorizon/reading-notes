package assignment05_kirkman_jacq;

import java.util.Random;
public class ExDivide
{
	public static void main(String[] args)
	{
		System.out.println("create an instance for fraction");
		
		try
		{
			Fraction f1 = new Fraction(1, 2);
			System.out.println(f1.toString());
			Fraction f2 = new Fraction(0, new Random().nextInt());
			System.out.println(f2.toString());
			System.out.println(String.format("-> divide %s by %s", f1.toString(), f2.toString()));
			f1.divide(f2);
		}
		catch (Exception e) { System.out.print(e.getClass().getName()); }
		finally { System.out.println(); }
	}
}